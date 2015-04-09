public class SumOfMulitplesOfThreeAndFive
{
  //Задаём переменную, которая делится на 3, 5 их сумму (поля).
  public int sumofmultfiveandthree = 0;
  //Задаём функциi, которая вычислит все числа,которые делятся на 3 и 5 и их сумму (методi).
  public void finalAnswer() 
    
      {
    int i = 3; 
    int range = 1000;
    while(i < 1000) 
        {
         if(i % 3 == 0 | i % 5 == 0) 
         {
          this.sumofmultfiveandthree += i;
          System.out.println(this.sumofmultfiveandthree);
         }
     i ++;
   
         }
     
    
  
      }
  


}
//hui1