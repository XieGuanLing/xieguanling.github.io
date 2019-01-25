**registry是存储镜像的仓库，我们可以通过pull拉取镜像，push推送镜像。**

**有时候使用 Docker Hub 这样的公共仓库可能不方便，或者我们有些镜像是私有的，并不想推到docker hub上，则用户可以创建一个本地仓库供私人使用。**

**
**

### 

### 本地起registry服务：

1.拉取镜像：**docker pull registry**

2.启动registry： **docker run --name registry -p 5000:5000 -v ~/docker/registry/data:/var/lib/registry registry**

启动registry的时候，数据目录在容器的这个目录下：**/var/lib/registry**

**所以我们在起registry的时候需要把数据目录映射到本地，万一需要数据迁移，直接移动目录即可把数据移动到另一台主机**

**
**

---

### 给镜像加版本（默认是latest）：

我们可以通过docker build 或者 docker tag来给镜像加版本：

 - build方式（需要Dockerfile）：**docker build -t 192.168.1.253:5000/centos:latest .**

 - tag方式：**docker tag centos 192.168.1.253:5000/centos:latest**

然后通过**docker push 192.168.1.253:5000/centos:latest** 即可推送镜像到ip为253的registry

拉取镜像可以通过**docker pull 192.168.1.253:5000/centos:latest** 拉取centos镜像

