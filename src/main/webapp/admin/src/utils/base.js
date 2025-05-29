const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm04i6d/",
            name: "ssm04i6d",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm04i6d/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "智启学涯终生学习平台"
        } 
    }
}
export default base
