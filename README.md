# aStar
This is a Java program that simulates a race of the four smiley faces, assuming that they each use the A* algorithm along with the following heuristic function, h’(x):


(1) Number of vertical squares necessary to reach home from the starting position assuming that no obstacles were present
+


(2) Number of horizontal squares necessary to reach home once the vertical distance to home has been travelled, assuming that no obstacles were present
+


(3) Number obstacles encountered in the two previous calculations.

In other words, A* will use the usual g(x) function, describing the actual cost of reaching node x and h’(x), given above, describing the optimistic estimate of h(x), where h(x) is the actual unknown remaining cost.

Estimated total cost from node x to goal f(x) = g(x) + h’(x).


