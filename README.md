# TabooLib SDK

## TabooLib Settings
```groovy
taboolib {
    tabooLibVersion = '5.34'
    loaderVersion = '2.3'
    classifier = null
}
```

### Main class
In `Kotlin`
```kotlin
@Plugin(depend = 5.34)
object ExamplePlugin {

    @Plugin.Loading
    fun onLoad() {
        // override onLoad()
    }

    @Plugin.Starting
    fun onEnable() {
        // override onEnable()
    }

    @Plugin.Stopping
    fun onDisable() {
        // override onDisable()
    }
}

```
