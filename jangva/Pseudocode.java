#pseudocode login

INPUT GET Email
INPUT GET Password

//login function
procedure Login(Email,Password):

    //validate email
    IF (database.email(Email)) THEN
         WHILE True:
            //temp inccorect password
            var int temp_password += 1
            //temp password check
            IF temp_password == 10
                //account lock
                account_lock(email)
                print "account lock please contact costumer service"

            ELSE
                //validate password 
                IF (database.password(password)) THEN
                   var int otp_generate = function generate_otp(email)
                   WHILE True
                         //temp inccorect OTP
                         var int temp_otp += 1
                         var int otp = input OTP
                         
                         IF var temp_otp == 10 THEN
                            //account lock
                            account_lock(email)
                            print "account lock please contact costumer service"
                         
                         ELSE
                             //validate OTP
                             IF var otp == otp_generate THEN
                                print "login success"
                                function dashboard()
                             ELSE
                                print "inccorect OTP input please input again"
                                next input OTP again
                             ENDIF
                         ENDIF
                    ENDWHILE    
                         
                 ELSE
                    print "incorrect password"
                    // input password again
                    input password

              ENDIF
          ENDWHILE
               
   
    ELSE:
        print "incorrect email"
        //input email again
        input email
    ENDIF

endprocedure       
    
          