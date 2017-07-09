# spring-02-wiring-beans
learn spring chapter 2, wiring beans
实现依赖注入
1.以xml方式注入
2.以java方式注入
  2.1 显式方式注入
  2.2 隐式方式注入
默认注入和原型注入，使用关键字scope可申明注入方式
1.默认注入：单列模式，返回同一个对象
2.原型注入：每调用getBean()都返回一个新的对象，scope="prototype"

