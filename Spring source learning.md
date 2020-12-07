# Spring source learning



### ApplicatonContext

![ApplicationContext](C:\Users\dell\Desktop\20201113\ApplicationContext.png)

```markdown
+ ApplicationContext
  + ListableBeanFactory 可以枚举所有的bean实例，而不是逐个尝试按名称查找bean
  + HierarchicalBeanFactory 继承bean的定义方式
  + MessageSource 消息国际化
  + ResourcePatternResolver 资源类解析模式策略 如ant-style path pattern
    - ResourceLoader
  + ApplicationEventPublisher 封装事件发布功能
  + EnvironmentCapable 相关环境接口  
```

### AnnotationConfigApplicatonContext

![AnnotationConfigApplicationContext](C:\Users\dell\Desktop\20201126\AnnotationConfigApplicationContext.png)

```markdown
+ AnnotationConfigApplicatonContext
  + GenericApplicationContext 典型的用法是通过BeanDefinitionRegistry接口注册各种bean定义，然后调用refresh（）用应用程序上下文语义初始化这些bean（处理org.springframework.context.ApplicationContextAware、自动检测BeanFactoryPostProcessors等）。
```

