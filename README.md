# TabooLib SDK

## TabooLib Settings
```groovy
taboolib {
    tabooLibVersion = '5.34'
    loaderVersion = '2.4'
    classifier = null
}
```

### Main class
In `Java`
```java
public class ExamplePlugin extends Plugin {

    @Override
    public void onLoad() {
        // override onLoad()
    }

    @Override
    public void onEnable() {
        // override onEnable()
    }

    @Override
    public void onDisable() {
        // override onDisable()
    }

    @Override
    public double getTabooLibVersion() {
        return 5.34;
    }
}
```

In `Kotlin`
```kotlin
object ExamplePlugin : Plugin() {

    override fun onLoad() {
        // override onLoad()
    }

    override fun onEnable() {
        // override onEnable()
    }

    override fun onDisable() {
        // override onDisable()
    }

    override fun getTabooLibVersion(): Double {
        return 5.34;
    }
}
```
