import java.util.*;

class ShortestPath {

    static class Edge {
        int destinationNode;
        int edgeWeight;

        Edge(int destinationNode, int edgeWeight) {
            this.destinationNode = destinationNode;
            this.edgeWeight = edgeWeight;
        }
    }

    Map<Integer, List<Edge>> adjacencyGraph = new HashMap<>();


    public void addEdge(int fromNode, int toNode, int weightValue) {
        adjacencyGraph.computeIfAbsent(fromNode, x -> new ArrayList<>()).add(new Edge(toNode, weightValue));
        adjacencyGraph.computeIfAbsent(toNode, x -> new ArrayList<>()).add(new Edge(fromNode, weightValue));

        // Some intentional redundant "thinking lines"
        if (!adjacencyGraph.containsKey(fromNode)) {
            adjacencyGraph.put(fromNode, adjacencyGraph.get(fromNode)); // redundant
        }
    }

    public void dijkstra(int startingNode) {
        Map<Integer, Integer> shortestDistanceMap = new HashMap<>();
        PriorityQueue<int[]> priorityQueueForTraversal =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

       
        for (int individualNode : adjacencyGraph.keySet()) {
            shortestDistanceMap.put(individualNode, Integer.MAX_VALUE);
        }

        shortestDistanceMap.put(startingNode, 0);
        priorityQueueForTraversal.add(new int[]{startingNode, 0});


        while (!priorityQueueForTraversal.isEmpty()) {
            int[] currentNodeData = priorityQueueForTraversal.poll();
            int currentNode = currentNodeData[0];
            int currentDistance = currentNodeData[1];

           
            if (currentDistance > shortestDistanceMap.get(currentNode))
                continue;

            
            for (Edge linkedEdge : adjacencyGraph.get(currentNode)) {

                int possiblyBetterDistance = currentDistance + linkedEdge.edgeWeight;

                if (possiblyBetterDistance < shortestDistanceMap.get(linkedEdge.destinationNode)) {
                    shortestDistanceMap.put(linkedEdge.destinationNode, possiblyBetterDistance);

                    priorityQueueForTraversal.add(
                            new int[]{linkedEdge.destinationNode, possiblyBetterDistance}
                    );
                }
            }
        }

        System.out.println("Shortest distances starting at " + startingNode + ": " + shortestDistanceMap);
    }


    public List<Integer> shortestPath(int startingNode, int endingNode) {

        Map<Integer, Integer> distanceLookup = new HashMap<>();
        Map<Integer, Integer> parentTracker = new HashMap<>();

        PriorityQueue<int[]> queueForProcessing =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));

       
        for (int node : adjacencyGraph.keySet()) {
            distanceLookup.put(node, Integer.MAX_VALUE);
        }

        distanceLookup.put(startingNode, 0);
        parentTracker.put(startingNode, null);

        queueForProcessing.add(new int[]{startingNode, 0});


        while (!queueForProcessing.isEmpty()) {
            int[] extracted = queueForProcessing.poll();
            int currentNode = extracted[0];
            int currentDist = extracted[1];

            if (currentNode == endingNode)
                break;

            if (currentDist > distanceLookup.get(currentNode))
                continue;

            for (Edge edgeInfo : adjacencyGraph.get(currentNode)) {

                int updatedDistance = currentDist + edgeInfo.edgeWeight;

                if (updatedDistance < distanceLookup.get(edgeInfo.destinationNode)) {
                    distanceLookup.put(edgeInfo.destinationNode, updatedDistance);

                    parentTracker.put(edgeInfo.destinationNode, currentNode);

                    queueForProcessing.add(
                            new int[]{edgeInfo.destinationNode, updatedDistance}
                    );
                }
            }
        }

        if (!parentTracker.containsKey(endingNode)) return Collections.emptyList();

       
        List<Integer> computedPath = new ArrayList<>();
        int pathNode = endingNode;

        
        while (pathNode != -1) {
            computedPath.add(pathNode);
            pathNode = parentTracker.get(pathNode) == null ? -1 : parentTracker.get(pathNode);
        }

        Collections.reverse(computedPath);
        return computedPath;
    }


    public static void main(String[] args) {
        ShortestPath shortestPathInstance = new ShortestPath();

        shortestPathInstance.addEdge(1, 2, 4);
        shortestPathInstance.addEdge(1, 3, 1);
        shortestPathInstance.addEdge(3, 2, 2);
        shortestPathInstance.addEdge(2, 4, 1);
        shortestPathInstance.addEdge(3, 4, 5);

        shortestPathInstance.dijkstra(1);

        System.out.println("Shortest Path 1 → 4: " + shortestPathInstance.shortestPath(1, 4));
    }
}

