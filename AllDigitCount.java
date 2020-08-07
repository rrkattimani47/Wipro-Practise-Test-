Using JAVA 7
Link : https://tests.mettl.com/authenticateKey/ed6b4da

import java.io.*;
import  java.util.*; 
//Read only region start
class UserMainCode{
public int allDigitsCount(int input1){
//Read only region end
// Write code here...       
  int count=0;  
  while(input1!=0)    {   
  input1/=10;   
  ++count;    
}
  return count; 
}
}
