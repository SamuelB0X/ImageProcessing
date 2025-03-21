public class Main {
    public static void main(String[] args) {
        int[][] imageData = ImageProcessing.imgToTwoD("./apple.jpg");

        // Recortar Bordes de la Imagen
        int[][] trimmed = ImageProcessing.trimBorders(imageData, 60);
        ImageProcessing.twoDToImage(trimmed, "./trimmed_apple.jpg");

        // Versión Negativa de la Imagen
        int[][] negative = ImageProcessing.negativeColor(imageData);
        ImageProcessing.twoDToImage(negative, "./negative_apple.jpg");

        // Estirar la Imagen Horizontalmente
        int[][] stretched = ImageProcessing.stretchHorizontally(imageData);
        ImageProcessing.twoDToImage(stretched, "./stretched_apple.jpg");

        // Reducir la Imagen Verticalmente
        int[][] shrink = ImageProcessing.shrinkVertically(imageData);
        ImageProcessing.twoDToImage(shrink, "./shrink_apple.jpg");

        // Invertir la Imagen
        int[][] inverted = ImageProcessing.invertImage(imageData);
        ImageProcessing.twoDToImage(inverted, "./inverted_apple.jpg");

        // Aplicar un Filtro de Color
        int[][] filter = ImageProcessing.colorFilter(imageData, 40, -30, 20);
        ImageProcessing.twoDToImage(filter, "./filter_apple.jpg");

        // Pintar una Imagen con Colores Aleatorios
        int[][] canvas = new int[500][500];
        int[][] random = ImageProcessing.paintRandomImage(canvas);
        ImageProcessing.twoDToImage(random,".random_image.jpg");

        // Dibujar un Rectángulo en una Imagen
        int[] rgba = {0, 255, 255, 255};
        int blueColor = ImageProcessing.getColorIntValFromRGBA(rgba);
        canvas = ImageProcessing.paintRectangle(canvas, 200, 100, 200, 150, blueColor);
        ImageProcessing.twoDToImage(canvas, "rectangle_image.jpg");

        // Arte Abstracto
        canvas = ImageProcessing.generateRectangles(canvas, 1000);
        ImageProcessing.twoDToImage(canvas, "abstract_art.jpg");
        ImageProcessing.twoDToImage(ImageProcessing.generateRectangles(new int[500][500], 1000), "abstract_art.jpg");
    }
}