package acme.ta.enhancements.entity

enhancement ABCompanyEnhancement : entity.ABCompany {
  
/* Returns length of Employees array
*/  
   property get NumberOfEmployees() : int {
 
   return this.Employees.length

   } // end of property

  
} // end ABCompanyEnhancement enhancement
