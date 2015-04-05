import java.util.Random;

public class Shuffle {
	private Random random=new Random();
	public void shuffle(int [] a){
		int [] labels=new int[a.length];
		int amount=0;
		int bound=(int)(0.25*a.length);
		System.out.println(">> "+bound);
		if(bound!=0){
			do{
				int i=random.nextInt(a.length);
				int j=random.nextInt(a.length);
				if ((labels[i]!=1 || labels[j]!=1) && a[i]!=a[j]){
					int tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
					if(labels[i]!=1){
						labels[i]=1;
						amount++;
					}else
						if(labels[j]!=1){
							labels[j]=1;
							amount++;
						}
				}
			}while(amount<bound);
		}
	}
	public void output(int [] arr){
		for(int i=0;i<arr.length;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
	public void output(int [][] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
			     System.out.print(" "+arr[i][j]);
			System.out.println();
		}
		
	}
    public void shuffle(int [][]a){
    	int[][] labels=new int[a.length][];
    	for(int i=0;i<a.length;i++)
			labels[i]=new int[a[i].length];
    	int amount=0;
		int bound=countMatrixAmount(a);
		System.out.println(">> "+bound);
		if(bound!=0){
			do{
				int i=random.nextInt(a.length);
				int j=random.nextInt(a[i].length);
				int k=random.nextInt(a.length);
				int l=random.nextInt(a[k].length);
				if ((labels[i][j]!=1 || labels[k][l]!=1) && a[i][j]!=a[k][l]){
					int tmp=a[i][j];
					a[i][j]=a[k][l];
					a[k][l]=tmp;
					if(labels[i][j]!=1){
						labels[i][j]=1;
						amount++;
					}
						if(labels[k][l]!=1){
							labels[k][l]=1;
							amount++;
						}
				}
			}while(amount<bound);
		}	
	}
	public static void main(String ...args){
		Shuffle s=new Shuffle();
		int [] arr=new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int [][] arr1=new int [][]{{1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14},{15,16}};
		s.shuffle(arr);
		s.output(arr);
		s.shuffle(arr1);
		s.output(arr1);
	}
	public int [] copyArray(int [] array){
		int [] result=new int [array.length];
		for(int i=0;i<array.length;i++){
			result[i]=array[i];
		}
		return result;
	}
	public int [][] copyMatrix(int [][] array){
		int [][] result=new int [array.length][];
		for(int i=0;i<array.length;i++){
			result[i]=new int[array[i].length];
			for(int j=0;j<array[i].length;j++)
			      result[i][j]=array[i][j];
		}
			
		return result;
	}
    public int countMatrixAmount(int [][]a){
    	int counter=0;
    	for(int i=0;i<a.length;i++)
    		for(int j=0;j<a[i].length;j++)
    			counter++;
    	return (int)(0.25*counter);		
    }
}
