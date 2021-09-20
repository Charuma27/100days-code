#include <stdio.h>
#include <conio.h>
//int maxsize =10;
//int arr[maxsize];
int arr[10];
int currentsize=0; 
void insert(int,int); 
void del(int); 
int find(int);
void printlist();
int main()
{
	
int choice=0,p,x; while(choice<=4)
{
//clrscr();
printf("1.insert\n2.delete\n3.find\n4.display \n5.exit\nEnter your choice"); 
scanf("%d",&choice);

switch(choice)
{
case 1: 
    printf("Enter the possition and value "); 
	scanf("%d %d",&p,&x);
    insert(p,x); break;
case 2: 
    printf("Enter the Element to delete"); 
	scanf("%d",&x);
    del(x); break;
case 3: 
    printf("Enter the Element to find"); 
	scanf("%d",&x);
    p=find(x);
    printf("Element found at %d",p); break;
case 4: 
    printlist();
    break;
}
getch();
}
}


void insert(int po,int x)
{
int i=currentsize;
while(po<=i)
{
arr[i]= arr[i-1]; 
i--;
}
arr[i]=x; 
currentsize=currentsize+1;
}



void del(int x)



{
int i,po; 
po=find(x); 
if(po!=-1)
{
i=po;
while(i<currentsize)
{
arr[i-1]=arr[i]; 
i++;
}
currentsize=currentsize-1;
}
else
printf("Element not found");
}
int find(int x)
{
int i=0;
while(i<currentsize && arr[i]!=x)
{
i=i+1;
}
if(i==currentsize)
{ 
return -1;
}
else
{ 
return (i+1);
} 
}



void printlist()
{ 
int i; 
for(i=0;i<currentsize;i++) 
printf("%d\n",arr[i]);
}
 
 
