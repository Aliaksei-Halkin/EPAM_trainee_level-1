package module.fifth.task5a;

public class Florist {
    public FlowerArrangement simple(Builder builder) {
        builder.addFlower(new Flower(FlowerName.BLOSSOM, 10, Color.ORANGE));
        builder.addPackaging(Packaging.CRAFT_PAPER);
        return builder.build();
    }

    public FlowerArrangement complex(Builder builder) {
        builder.addPackaging(Packaging.CORRUGATED_PAPER);
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        builder.addFlower(new Flower(FlowerName.FREESIA, 10, Color.RED));
        return builder.build();
    }
}
