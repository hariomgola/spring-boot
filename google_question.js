Consider the points 0, 1, …, N, N + 1 on the number line. There is a teleporter located on each of the points 1, 2 ,…, N. At point i, you can do the following:

1. Move left one unit: it costs 1 coin.
2. Move right one unit: it costs 1 coin.
3. Use a teleporter at point i, if it exists: it costs 1 coin. As a result, you teleport to point 0. Once you use a teleporter, you can't use it again.

You have C coins, and you start at point 0. What's the most number of teleporters you can use?

Example: N = 5, C = 6

0 1 2 3 4 5 6
  _ _ _ _ _  // “tele”
        // “Done”

The most number of teleporters we can use is 2.

Move right from 0 to 1. The remaining coins are 6 - 1 = 5.
Use teleporter at 1. The remaining coins are 5 - 1 = 4.
Move right from 0 to 1 and then 1 to 2. The remaining coins are 4 - 1 - 1= 2. Note that you can’t use teleporter at 1 since you already used it in the previous step.
Use teleporter at 2. The remaining coins are 2 - 1 = 1.
Using 1 coin, you can go only as far as 1 now.

[[1,1],[1,2],[1]] // position

function(number_line,coins){
Const first_data = []
Const child_data = []
{
 0 :null,
 1: “tele”,
 2:”tele”
}
for(let i=0;i<number_line;i++){
  for(let j=i;j<number_line;j++) {
     if(child_data .length == 2){
        first_data.push(child_data );
        child _data = [];
     }
   }
}
