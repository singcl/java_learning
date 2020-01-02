### 1 .iml IDE 项目配置文件

### 2
```shell
Intellij中出现：Diamond types are not supported at this language level
```
`Ctrl+Alt+Shift+S` > `Project` > `Project Language level` > `8-Lambda,type annotation etc.`

### 3 所有java文件都不能正确识别

`src`上右键 > `Mark Directory As` > `Source Root`

或者直接修改`.iml`文件中`<sourceFolder url="file://$MODULE_DIR$/src" isTestSource="false" />`