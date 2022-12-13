class	J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <=5)
		{
			System.out.println("while loop body begin:" + i);
			for (int j = 100 ;j<=103 ; j++ )
			{
				System.out.println("for loop begin : " +i +" ," + j);
				System.out.println("for loop end : " +i +" ," + j);
			}
			System.out.println("while loop body end:" + i); 
			i++ ; 
			
		}
		System.out.println("main end" + i);  
	}
}
/*

main begin
while loop body begin:1
for loop begin : 1 ,100
for loop end : 1 ,100
for loop begin : 1 ,101
for loop end : 1 ,101
for loop begin : 1 ,102
for loop end : 1 ,102
for loop begin : 1 ,103
for loop end : 1 ,103
while loop body end:1
while loop body begin:2
for loop begin : 2 ,100
for loop end : 2 ,100
for loop begin : 2 ,101
for loop end : 2 ,101
for loop begin : 2 ,102
for loop end : 2 ,102
for loop begin : 2 ,103
for loop end : 2 ,103
while loop body end:2
while loop body begin:3
for loop begin : 3 ,100
for loop end : 3 ,100
for loop begin : 3 ,101
for loop end : 3 ,101
for loop begin : 3 ,102
for loop end : 3 ,102
for loop begin : 3 ,103
for loop end : 3 ,103
while loop body end:3
while loop body begin:4
for loop begin : 4 ,100
for loop end : 4 ,100
for loop begin : 4 ,101
for loop end : 4 ,101
for loop begin : 4 ,102
for loop end : 4 ,102
for loop begin : 4 ,103
for loop end : 4 ,103
while loop body end:4
while loop body begin:5
for loop begin : 5 ,100
for loop end : 5 ,100
for loop begin : 5 ,101
for loop end : 5 ,101
for loop begin : 5 ,102
for loop end : 5 ,102
for loop begin : 5 ,103
for loop end : 5 ,103
while loop body end:5
main end6


nesting loop:loop inside the loop
inside a while loop we are developing the for loop



*/