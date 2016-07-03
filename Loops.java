class Loops
{
public static void main(String args[]){

//int r[] = {10,20,30,40,50};
//int []r = {10,20,30,40,50};
//int r[] = new int[5]; // All initalize from 0 
 int r[] = new int[]{10,20,30,40,50,90,78,56};
/*for(int i=0; i<r.length; i++){
System.out.println(r[i]);
} */
// To Traverse an Array , Use Enhance for Java (1.5)
/*for(int i : r){
System.out.println(" Value is "+i);
}*/

// ************** 2-d Array
//int t[][]= new int[3][3];
//int [][] t = new int[3][3];
//int []t[] = new int[3][3];
 //int t[][] = {{10,20,30},{40,90,100},{100,200,300}};
//int k [] = {10,20,30,40,50};
//int t[][] = new int[3][];
//t[0]= new int[10];
//t[1] = new int[20];
//t[2] = new int[30];
int t[][][]= new int[3][3][3];

for(int i[][]:t){
for(int j[] :i){
for(int k : j){
System.out.println(k);
}
}
}

/*for(int i[]:t){
for(int j : i){
System.out.print(j+" ");
}
System.out.println();
}*/

/*for(int i = 0;i<t.length; i++){
for(int j = 0 ; j<t[i].length;j++){
	System.out.print(t[i][j]+" ");
}
System.out.println();
}*/



/*(while(true){

}

int j = 1;
while(j<=10){
if(j==5){
j+=2;
}
else
{
j++;
}
}

for(int i = 1; i<=10 ;i++){
System.out.println("I is "+i);

}*/
}
}
