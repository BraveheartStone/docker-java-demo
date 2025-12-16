# docker-java-demo
## 项目介绍
docker-java-demo 是一个基于 Spring Boot 框架的 Java 项目，用于演示如何在 Docker 中部署 Java 应用程序。

## 健康检查
- http://localhost:8089/health - 健康检查接口，返回 `success` 表示应用程序正常运行。

## 使用 AWS Fargate 构建教程

### 1. 在当前项目根目录创建 dockerfile 文件

1. 创建 dockerfile 文件
2. 执行 mvn 命令构建项目
   ```
   mvn clean package
   ```

### 2. Dockerfile 构建 Docker 镜像
1. 构建 Docker 镜像
   ```
   docker build -t docker-java-demo .
   ```
   > 执行 docker 命令前需要将 docker 启动

2. 查看镜像
   ```
   docker images
   ```
3. 运行容器
   ```
   docker run -d -p 8089:8089 --name java-demo docker-java-demo
   ```
4. 查看容器
   ```
   docker ps
   ```
5. 查看容器日志
   ```
   docker logs java-demo
   ```
6. 访问应用程序
   - 打开浏览器，访问 `http://localhost:8089/health`，如果返回 `success` 表示应用程序正常运行。
7. 停止容器
   ```
   docker stop java-demo
   ```
