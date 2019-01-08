package com.leetcode.string.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEmails {
    public int numUniqueEmails1(String[] emails) {
        
        List<String> filteredEmails=new ArrayList<String>();
        for(int i=0;i<emails.length;i++){
            String email=massageEmail(emails[i]);
            if(!filteredEmails.contains(email)){
                filteredEmails.add(email);
            }
        }
        return filteredEmails.size();
    }
    
    public String massageEmail(String email){
        String[] s=email.split("@");
        if(s.length>1){
           String[] name= s[0].split("\\+");
            String localname=name[0].replace(".","");
            email=localname+"@"+s[1];
        }
        return email;
    }
    
    
    public int numUniqueEmails(String[] emails) {
        Set<String> seen = new HashSet();
        for (String email: emails) {
            int i = email.indexOf('@');
            String rest = email.substring(i);
            seen.add(rest);
        }
        return seen.size();
    }
    public static void main(String[] args) {
    	UniqueEmails uniqueEmail=new UniqueEmails();
    	uniqueEmail.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
    			"test.email+blex@leetcode.com",	"testemail+david@lee.tcode.com"});
	}
}
