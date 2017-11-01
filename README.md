# Practice task:

- Fork SimpleJ2EEProject
- Create git branch "newServlet"
- Create HttpServlet and map to "/" (use BaseHttpServlet which is in project) and commit changes
- Get instance of HelloWorldGenerator from context BaseHttpServlet.getBean() and print it in page (use htm page structure), commit
- Change HelloWorldGeneratorImpl hello text to "Hello world", commit
- Push changes to remote
- Checkout master
- Create new branch "newHelloText"
- Change HelloWorldGeneratorImpl hello text to "Hello visitor", commit
- Push changes to remote
- Checkout master
- Merge branch newHelloText to master, push
- Merge branch newServlet to master, push
- run "mvn package" and  Deploy web-app.war to tomcat
- Connect to tomcat debug port
- create breakpoint in servlet
- Change hello text from debug to "broken Hello"
- Show result to lecture


# Project manual
- copy setenv.bat to {tomcatDir}/bin to enable debug port 8000
- to create war artifact run "mvn package" (maven should be installed and configured)
 (https://www.mkyong.com/maven/how-to-install-maven-in-windows/)

# Lecture Materials
- Git lecture video https://www.youtube.com/watch?v=iJm0xflVz_8
- Lecture pptx files https://drive.google.com/drive/folders/0B4OuEuZP2SJYUTR4RjNNeXI3ZGM?usp=sharing
- Contact me andreydemosoft@gmail.com
- telegram chat https://t.me/joinchat/EY_wXQx2hyoLgYSerz8_qw

# SimpleJ2EEProject
Simple java 2 EE project fro TI karazin java course

- Set up GitHub account
- Import project
- Set up simple web project (1 servlet)
- Make commit/push
- Make branch/merge
- Debug Servlet"


https://start.spring.io/

# Practice task 2:

1. Dowload and Import new spring project
   1. Open https://start.spring.io/
   2. Select maven spring boot project with version 1.5.8
   3. Search for dependency named "Web" and add it
   4. Click Generate project
   5. Unzip
   6. Import as new maven project
   7. Wait when all dependecies will be resolved
   8. Check tha you have DemoApplication.java file
   
2. Create Controller
   1. Create class NewController
   2. Mark class with @RestController Annotation
   3. Create Method 

          public String index(){
              return "<html><body><h1>Hello</h1></body></html>";
          }

   4. Mark method with following annotation 

          @RequestMapping(value = "/index.html", method = RequestMethod.GET)
        
   5. Check that you have right imports 

          import org.springframework.web.bind.annotation.RequestMapping;
          import org.springframework.web.bind.annotation.RequestMethod;
          import org.springframework.web.bind.annotation.RestController; 
           
   6. Run DemoApplication.main()
   7. Check result http://localhost:8080/index.html
2. Spring boot configuration
   1. Find file /src/main/resources/application.properties
   2. Put following config
   
          server.port=8081
          
   3. Chek results on new port
   4. Add following config to /src/main/resources/application.properties
   
          custom.message=Hello My friend
   5. Add Filed and constructor to your controller 
       
           private final String msg;

          public NewController(@Value("${custom.message}") String msg) {
              this.msg = msg;
          }
    6. Pay Atentions on following code in construictor. (It is injection of value from config files)
    
           @Value("${custom.message}") String msg
    7. Change your method to dispaly varibe "msg" on yopur page 
    8. Check results
