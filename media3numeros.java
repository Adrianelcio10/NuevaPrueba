public class MediaAritmetica {

	
	public static Integer getMedia(Integer x,Integer y, Integer z){
		Integer res;
		Integer suma;
		if(x ==0 && y==0 && z==0){
			res=0;
		}else{
			suma = x + y + z;
			res=suma/3;
		}
	return res;
	}
	public static void main(String[] args) {
		System.out.println("El resultado es:"+MediaAritmetica.getMedia(3, 4, 2));
	}
}