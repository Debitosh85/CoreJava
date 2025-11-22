# Code Citations

## License: unknown
https://github.com/GregBowyer/ManagedRuntimeInitiative/tree/91e81d7310f5292c625f4953a3d5d87367a1d6d0/MRI-J/jdk/src/share/classes/java/lang/String.java

```
public boolean equals(Object anObject) {
    if (this == anObject) {
        return true;
    }
    if (anObject instanceof String) {
        String anotherString = (String) anObject;
        int n = value.length;
        if (n == anotherString.value.length) {
            char
```


## License: unknown
https://github.com/shannah/codenameone-avian/tree/84e2a17e99d2ff7db1da4246e833edb84e86f0f0/jdk7u-dev/jdk/src/share/classes/java/lang/String.java

```
instanceof String) {
        String anotherString = (String) anObject;
        int n = value.length;
        if (n == anotherString.value.length) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = 0;
            while (n
```


## License: unknown
https://github.com/pringce/pringce.github.io/tree/e304ef461f09a33f705701a0700865eeabe32eeb/source/_posts/Object%E7%B1%BB.md

```
anotherString.value;
            int i = 0;
            while (n-- != 0) {
                if (v1[i] != v2[i])
                    return false;
                i++;
            }
            return true;
        }
    }
    return false;
}
```

- **
```

