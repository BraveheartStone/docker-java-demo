# 使用Azul Zulu 21作为基础镜像
#FROM azul/zulu-openjdk:21-jre-slim
FROM azul/zulu-openjdk:21-jdk-crac-latest

# 使用OpenJDK 21作为基础镜像
#FROM openjdk:21-jre-slim

# 设置工作目录
WORKDIR /app

# 复制构建好的JAR文件到镜像中
COPY build/libs/application-1.0-SNAPSHOT.jar app.jar

# 暴露应用程序端口
EXPOSE 8089

# 设置启动命令
ENTRYPOINT ["java", "-jar", "app.jar"]