# scraper-ubuntu-docker

## build Docker test image

docker build --no-cache -t scraper-test-ubuntu .

## run Docker image

docker run -it scraper-test-ubuntu

## run test in container

git clone https://github.com/smatei/scraper-ubuntu-docker.git

cd scraper-ubuntu-docker/

mvn compile

mvn exec:java

## Output will be:

> Testing domain 971menu.com
>
> Testing domain anaheimwhitehousewedding.com
>
> Testing domain wvtailgatecentral.com
>
> Testing domain 8thonglor.com
>
> Testing domain wmfilms.net
>
> Testing domain allaboutgreatestates.com
>
> Testing domain firabackpackers.com
>
> Testing domain ackerstone.com
>
> Testing domain cooldad.ca
>
> Testing domain zutek.com
>
> Testing domain familyfriends.uk.com
>
> SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
>
> SLF4J: Defaulting to no-operation (NOP) logger implementation
>
> SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
>
> org.openqa.selenium.WebDriverException: Build info: version: '3.141.0', revision: '2ecb7d9a', time: '2018-10-31T20:09:30'
>
> System info: host: 'baff240d4d42', ip: '172.17.0.2', os.name: 'Linux', os.arch: 'amd64', os.version: '4.9.125-linuxkit', java.version: '1.8.0_191'
>
> Driver info: driver.version: JBrowserDriver
>
>         at com.machinepublishers.jbrowserdriver.Util.handleException(Util.java:136)
>
>         at com.machinepublishers.jbrowserdriver.JBrowserDriver.navigate(JBrowserDriver.java:1131)
>
>         at TestBrowser$TestDomain.run(TestBrowser.java:66)
>
> Caused by: java.io.EOFException
>
>         at java.io.DataInputStream.readByte(DataInputStream.java:267)
>
>         at sun.rmi.transport.StreamRemoteCall.executeCall(StreamRemoteCall.java:222)
>
>         at sun.rmi.server.UnicastRef.invoke(UnicastRef.java:161)
>
>         at java.rmi.server.RemoteObjectInvocationHandler.invokeRemoteMethod(RemoteObjectInvocationHandler.java:227)
>
>         at java.rmi.server.RemoteObjectInvocationHandler.invoke(RemoteObjectInvocationHandler.java:179)
>
>         at com.machinepublishers.jbrowserdriver.$Proxy24.navigate(Unknown Source)
>
>         at com.machinepublishers.jbrowserdriver.JBrowserDriver.navigate(JBrowserDriver.java:1124)
>
>         ... 1 more
>
> org.openqa.selenium.WebDriverException: Build info: version: '3.141.0', revision: '2ecb7d9a', time: '2018-10-31T20:09:30'
>
> System info: host: 'baff240d4d42', ip: '172.17.0.2', os.name: 'Linux', os.arch: 'amd64', os.version: '4.9.125-linuxkit', java.version: '1.8.0_191'
>
> Driver info: driver.version: JBrowserDriver
>
>         at com.machinepublishers.jbrowserdriver.Util.handleException(Util.java:136)
>
>         at com.machinepublishers.jbrowserdriver.JBrowserDriver.navigate(JBrowserDriver.java:1131)
>
>         at TestBrowser$TestDomain.run(TestBrowser.java:66)
>
> Caused by: java.io.EOFException
>
>         at java.io.DataInputStream.readByte(DataInputStream.java:267)
>
>         at sun.rmi.transport.StreamRemoteCall.executeCall(StreamRemoteCall.java:222)
>
>         at sun.rmi.server.UnicastRef.invoke(UnicastRef.java:161)
>
>         at java.rmi.server.RemoteObjectInvocationHandler.invokeRemoteMethod(RemoteObjectInvocationHandler.java:227)
>
>         at java.rmi.server.RemoteObjectInvocationHandler.invoke(RemoteObjectInvocationHandler.java:179)
>
>         at com.machinepublishers.jbrowserdriver.$Proxy24.navigate(Unknown Source)
>
>         at com.machinepublishers.jbrowserdriver.JBrowserDriver.navigate(JBrowserDriver.java:1124)
>
>         ... 1 more

## Run outside container (Windows 10 machine or CentOS machine)

> PS D:\_git_mine\scraper-ubuntu-docker> mvn exec:java
>
> [INFO] Scanning for projects...
>
> [INFO]
>
> [INFO] ------------------------------------------------------------------------
>
> [INFO] Building TestBrowser 0.0.1-SNAPSHOT
>
> [INFO] ------------------------------------------------------------------------
>
> [INFO]
>
> [INFO] >>> exec-maven-plugin:1.2.1:java (default-cli) > validate @ TestBrowser >>>
>
> [INFO]
>
> [INFO] <<< exec-maven-plugin:1.2.1:java (default-cli) < validate @ TestBrowser <<<
>
> [INFO]
>
> [INFO]
>
> [INFO] --- exec-maven-plugin:1.2.1:java (default-cli) @ TestBrowser ---
>
> Testing domain 971menu.com
>
> Testing domain firabackpackers.com
>
> Testing domain allaboutgreatestates.com
>
> Testing domain wmfilms.net
>
> Testing domain 8thonglor.com
>
> Testing domain wvtailgatecentral.com
>
> Testing domain anaheimwhitehousewedding.com
>
> Testing domain familyfriends.uk.com
>
> Testing domain zutek.com
>
> Testing domain cooldad.ca
>
> Testing domain ackerstone.com
>
> SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
>
> SLF4J: Defaulting to no-operation (NOP) logger implementation
>
> SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
>
> response for http://zutek.com: 200
>
> response for http://firabackpackers.com: 200
>
> response for http://ackerstone.com: 200
>
> response for http://wmfilms.net: 200
>
> response for http://cooldad.ca: 200
>
> response for http://971menu.com: 200
>
> response for http://anaheimwhitehousewedding.com: 200
>
> response for http://8thonglor.com: 200
>
> response for http://wvtailgatecentral.com: 200
>
> response for http://allaboutgreatestates.com: 200
>
> response for http://familyfriends.uk.com: 200
>
> [INFO] ------------------------------------------------------------------------
>
> [INFO] BUILD SUCCESS
>
> [INFO] ------------------------------------------------------------------------
>
> [INFO] Total time: 21.221 s
>
> [INFO] Finished at: 2018-12-21T16:29:20+02:00
>
> [INFO] Final Memory: 9M/491M
>
> [INFO] ------------------------------------------------------------------------
>
> PS D:\_git_mine\scraper-ubuntu-docker>
