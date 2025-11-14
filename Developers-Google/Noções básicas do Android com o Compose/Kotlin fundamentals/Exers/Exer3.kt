/*About temperature Celsius Fahrenheit Kelvin Celsius and Fahrenheit Kelvin */




fun main() {
   
    
    val t="temperature";
  
    
  printFinalTemperature(t)

    
    
}


fun printFinalTemperature(t:String){
    

        



    if(t=="temperature"){
        
            val c=12*9/5 + 32;
         	val k=12-273.15;
            val f=5.0 / 9.0 * 12-32 + 273.15 ;      
         
        
            println(" Celsius Fahrenheit $c");
            println(" Kelvin Celsius     $k");
            println(" Fahrenheit Kelvin  $f");
        
        
        
    }else{
        
        
        println("Error!");
    }
    
    
    
}
