package algorithms.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class KruskalsAlgo {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int numOfVertices=Integer.parseInt(br.readLine());
        int numOfedges=Integer.parseInt(br.readLine());

        Edge edgeArr[]=new Edge[numOfedges];


        for(int i=0;i<numOfedges;i++){

            String edgeInfo[]=br.readLine().split(" ");
            int source=Integer.parseInt(edgeInfo[0]);
            int dest=Integer.parseInt(edgeInfo[1]);
            int weight=Integer.parseInt(edgeInfo[2]);
            Edge edge=new Edge(source,dest,weight);
            edgeArr[i]=edge;

            }

        findMinimumSpanningTree(edgeArr,numOfVertices);


    }

    private static void findMinimumSpanningTree(Edge[]edgeArr,int numOfVertices) {
        List<Integer> srcDestList=new ArrayList<Integer>();

        for(int i=0;i<edgeArr.length;i++){
            List<Edge> edgeList=Arrays.asList(edgeArr);
            Collections.sort(edgeList, new Comparator<Edge>() {
                public int compare(Edge o1, Edge o2) {
                    return o1.getCost()-o2.getCost();
                }
            });
        }
        for(int i=0;i<edgeArr.length;i++){
            if(!(srcDestList.contains(edgeArr[i].getSource())&&srcDestList.contains(edgeArr[i].getDest()))) {
                srcDestList.add(edgeArr[i].getSource());
                srcDestList.add(edgeArr[i].getDest());
                System.out.println(i+" "+ edgeArr[i].getSource()+" "+edgeArr[i].getDest()+" "+edgeArr[i].getCost());

            }

        }

    }

}
