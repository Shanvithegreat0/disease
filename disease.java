int i=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Do you have high fever?\n"+"(a)YES      (b)NO");
        String st =sc.next();
         if(st.equalsIgnoreCase("yes"))
          i++;

        System.out.println("Do you have a headache?\n"+"(a)YES      (b)NO");
        
         st=sc.next();
         if(st.equalsIgnoreCase("yes"))
         i++;

         System.out.println("Do you have rashes or red spots over all your bodyor part of your body?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        
        System.out.println("do you have joint and muscle pain\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you have abdominal pain?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you have pain in the backside of your eyes?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        System.out.println("Do you feel like nausea and vomiting?\n"+"(a)YES      (b)NO");
        st=sc.next();
        if(st.equalsIgnoreCase("yes"))
        i++;
        if(i==7)
        System.out.println("YES YOU ARE SUFFERING FROM DENGUE ,KINDLY REFER TO A DOCTOR");