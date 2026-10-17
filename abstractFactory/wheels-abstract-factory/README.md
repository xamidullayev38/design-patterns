# Wheels & Car Parts - Abstract Factory Pattern

Ushbu loyiha Java tilida **Abstract Factory** design pattern'ini o'rganish uchun tayyorlangan sodda amaliy loyihadir.

## Loyiha strukturasi
- `Engine` va `Wheel` — Mahsulotlar (Products) interfeyslari.
- `SportEngine`, `SportWheel`, `ElectricEngine`, `ElectricWheel` — Konkret mahsulotlar.
- `CarFactory` — Abstrakt fabrika interfeysi.
- `SportCarFactory`, `ElectricCarFactory` — Konkret fabrikalar.
- `Main` — Loyihani ishga tushirish uchun mijoz (Client) kodi.

## Qanday ishga tushiriladi?
```bash
javac -d bin src/com/wheels/factory/*.java
java -cp bin com.wheels.factory.Main
```
