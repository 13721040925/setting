什么是工厂模式:

工厂模式（Factory Pattern）的意义就跟它的名字一样，在面向对象程序设计中，工厂通常是一个用来创建其他对象的对象。工厂模式根据不同的参数来实现不同的分配方案和创建对象。

在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。例如用工厂来创建 人 这个对象，如果我们需要一个男人对象，工厂就会为我们创建一个男人；如果我们需要一个女人，工厂就会为我们生产一个女人。

工厂模式通常分为：

普通工厂模式
多个工厂方法模式
静态工厂方法模式
