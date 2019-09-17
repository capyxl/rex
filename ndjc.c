#include <stdio.h>

int main()
{	int a = 0;
	int b = 1;
	int i;
	int c = 0;
	int d;
	printf("请输入一个数字\n");//计算阶乘
	scanf("%d", &a);

	for(d = 1 ; d <= a ; d++)
	{
        	for(i = 1 ; i <= d ; i++)
		{       

			b = b * i;
			printf("%d\n",b);
		}

		c = b + c;
		b = 1;
		printf(" c        %d\n",c);
	}
	printf( " c的大小是%d\n", c );
	return 0;
}





		
		
