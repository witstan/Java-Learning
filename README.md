# Java-Learning
learn to code

# step 1:
``` bash
git clone http://xxxx.git
```

# step2:
> 修改文件内容

# step3:
> 提交修改描述信息
* 1.查看当前修改的状态 - 可选
``` bash
git status
```
* 2.添加修改文件至暂存区
``` bash
git add --all
git add .
```
* 3.添加提交说明信息
``` bash
git commit -m 'xxx提交说明内容'
```

# step 4:
> 推送添加的暂存文件至远端仓库
``` bash
git push
```

# step 5:
> 拉取远程更新至本地仓库
``` bash
git pull
```

# 分支管理
* main - 主分支
* dev - 开发分支
* test - 测试分支

# step 1:
> 查看当前分支
``` bash
git branch
```
> 查看所有分支
``` bash
git branch --all
```

# step 2:
> 新建分支(以当前所在分支复制)
``` bash
git branch xxxname

git push xxxx
```


# step 3:
> 切换分支
``` bash
git checkout xxxname
```

# step4:
> 合并分支
```
git merge xxxname
```
