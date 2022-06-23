/* 30 Days_Code_Challenge
   Java Program For BFS and DFS Traversal in Graph
*/

import java.util.*;
import java.lang.*;
public class Day_15
{
  public LinkedList < Integer > adjecency[];

  public Main (int Node)
  {
    adjecency = new LinkedList[Node];
    for (int i = 0; i < Node; i++)
      {
	adjecency[i] = new LinkedList < Integer > ();
      }


  }

  public void InsertElement (int s, int d)
  {
    adjecency[s].add (d);
    adjecency[d].add (s);
  }
  void BFS_Traversal (int Source)
  {
    boolean[]Check = new boolean[adjecency.length];
    int[] parent = new int[adjecency.length];
    Queue < Integer > Q = new LinkedList <> ();
    Q.add (Source);
    Check[Source] = true;
    parent[Source] = -1;
    while (!Q.isEmpty ())
      {
	int p = Q.poll ();
	System.out.print (p + " ");
      for (int i:adjecency[p])
	  {
	    if (Check[i] != true)
	      {
		Check[i] = true;
		Q.add (i);
		parent[i] = p;
	      }
	  }
      }
  }
  void DFS_Traversal (int Source)
  {
    boolean VisitedNodes[] = new boolean[adjecency.length];
    int Parent[] = new int[adjecency.length];
    Stack < Integer > s = new Stack <> ();
    s.add (Source);
    VisitedNodes[Source] = true;
    Parent[Source] = -1;
    while (!s.isEmpty ())
      {
	int data = s.pop ();
	System.out.print (data + " ");
      for (int i:adjecency[data])
	  {
	    if (VisitedNodes[i] != true)
	      {
		VisitedNodes[i] = true;
		s.add (i);
		Parent[i] = data;
	      }
	  }
      }
  }

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int Node, edge;
    System.out.print ("Enter Number Of Nodes And Edges : ");
    Node = sc.nextInt ();
    edge = sc.nextInt ();
    int s, d;
    System.out.print ("Enter Source Node And Destination  Node : ");
    Main g = new Main (Node);
    for (int i = 0; i < edge; i++)
      {
	s = sc.nextInt ();
	d = sc.nextInt ();
	g.InsertElement (s, d);
      }
    int Source;
    System.out.println ("Enter Source Node : ");
    Source = sc.nextInt ();
    g.BFS_Traversal (Source);
    System.out.println ();
    g.DFS_Traversal (Source);
  }
}

