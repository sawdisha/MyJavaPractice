import java.util.Scanner;
public class UpdateExistingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[10];
		arr[0]=5;
		arr[1]=2;
		arr[2]=8;
		arr[3]=7;
		arr[4]=1;
		//Elements of existing array
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		Scanner sc=new Scanner(System.in);
		//Enter the number you want to store in the array
		arr[5]=sc.nextInt();
		//sorting elements of updated array in ascending order
		int temp=0;
		for(int i=0;i<6;i++)
		{
			for(int j=i+1;j<6;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
