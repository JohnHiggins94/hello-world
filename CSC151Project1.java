/**
   The CSC151Project1 class creates an object to store information relating to an indivudals insurence policy
*/ 


public class CSC151Project1 { 
   
   private String policyNumber;
   private String providerName; 
   private String fName; 
   private String lName; 
   private int age; 
   private String smokerStatus; 
   private double height; 
   private double weight; 
   final private int BASE_COST = 600; 
   
   /* 
      Constructor no-arg
   */ 
   public CSC151Project { 
      policyNumber = "Null";
      providerName = "Null"; 
      fName = "Null"; 
      lName = "Null";
      age = 0;
      smokerStatus = "Null"; 
      height = 0.0; 
      weight = 0.0; 
   }
   
   /*
      Constructor for all fields 
   */ 
   
   public CSC151Project1 (String pNum, String proName, String firstN, String lastN, int howOld, 
                           String smokeStatus, double heightInInches, double weightInPounds) { 
      
      policyNumber = pNum; 
      providerName = proName; 
      fName = firstN; 
      lName = lastN; 
      age = howOld; 
      smokerStatus = smokeStatus; 
      height = heightInInches;  
      weight = weightInPounds;
   } 
   
   /* 
      The setPolicyNumber sets the policyNumber field
      @perma pNum The policy number 
   */ 
   
   public void setPolicyNumber(String pNum) { 
   
      policyNumber = pNum; 
   } 
   
   /*
      The getPolicyNumber returns the policyNumber field 
      @return The policy number
   */ 
   
   public String getPolicyNumber { 
      return policyNumber; 
   } 
   
   /* 
      The setProviderName sets the providerName field 
      @perma The name of the insurence provider 
   */ 
   
   public void setProviderName(String proName) {
      providerName = proName; 
   } 
   
   /* 
      The getProviderName method returns the providerName field 
      @return providerName The name of the provider 
   */ 
   
   public String getProviderName { 
      return providerName; 
   }   
   
   /* 
      The setFirstName method sets the fName field
      @perma firstN The first name of the policy holder
   */ 
   
   public void setFirstName(String firstN) {
      fName = firstN; 
   } 
   
   /*
      The getFirstName method 
      @return The fName field 
   */ 
   
   public String getFirstName { 
      return fName; 
   }   
   
   /*
      The setLastName field sets the lName field
      @perma lastN The last name of the policy holder 
   */ 
   
   public void setLastName(String lastN) {
     lName = lastN; 
   } 
   
   /*
      The getLastName method
      @return lName The last name of the policy holder 
   */ 
   
   public String getLastName { 
      return lName; 
   } 
   
   /*
      The setAge method sets the age field 
      @perma howOld The age of the policy holde r
   */ 
   
   public void setAge(int howOld) { 
      age = howOld; 
   } 
   
   /*
      The getAge method 
      @return age The age field 
   */ 
   
   public int getAge { 
      return age; 
   } 
   
   /*
      The setSmokerStatus method sets the smokerStatus field 
      @perma smokeStatus The string value indicating if the policy holder is a "smoker" or non "non-smoker" 
   */ 
   
   public void setSmokerStatus(String smokeStatus) { 
      smokerStatus = smokeStatus; 
   } 
   
   // 
   
   public String getSmokeStatus { 
      return smokerStatus; 
   } 
   
   // 
   
   public void setHeight (double heightInInches) { 
      height = heightInInches; 
   } 
   
   //
   
   public double getHeight { 
      return height; 
   } 
   
   public double getBMI { 
      return (weight * 703) / (height * height); 
   } 
   
   // 
   
   public int calcInsurenceCost { 
      double cost = 0.00; 
      bodyMassIndex = getBMI(); 
      cost += BASE_COST; 
      
      if (age > 50) 
         cost += 75; 
      if (smokerStatus.equalsIgnoreCase("SMOKER") { 
         cost+= 100;     
      if (bodyMassIndex > 35.0) { 
         cost+= (BMI - 35) * 20; 
      return cost; 
   }  
} 

  
         
         
   
      
   
   
     
     

   