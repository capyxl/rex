#include <stdio.h>

int main()
{
        int age = 0;
        printf("请输入年龄\n");
        scanf("%d", &age);
        if(age < 0)
        {
                printf("error\n");
        }
        else if(age > 0 && age <= 18)
        {
                printf("未成年\n");
        }
        else if(age > 18)
        {
                printf("成年\n");
        }
        else
        printf("???\n");
        return 0;
}
