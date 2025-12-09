package GsQuestions.Robot;

public class RobotDirection {
    public static int[] finalPosition(String input) {

        int x = 0, y = 0;

        // Split by space (handles words + multipliers)
        String[] parts = input.split(" ");

        for (String p : parts) {

            if (p.equalsIgnoreCase("U") || p.equalsIgnoreCase("UP")) {
                y++;
            } else if (p.equalsIgnoreCase("D") || p.equalsIgnoreCase("DOWN")) {
                y--;
            } else if (p.equalsIgnoreCase("L") || p.equalsIgnoreCase("LEFT")) {
                x--;
            } else if (p.equalsIgnoreCase("R") || p.equalsIgnoreCase("RIGHT")) {
                x++;
            }

            // Case: "2xRIGHT" / "3xLEFT"
            else if (p.contains("x")) {
                String[] temp = p.split("x");
                int count = Integer.parseInt(temp[0]);   // e.g., 2
                String dir = temp[1];                   // e.g., RIGHT

                if (dir.equalsIgnoreCase("U") || dir.equalsIgnoreCase("UP")) {
                    y += count;
                } else if (dir.equalsIgnoreCase("D") || dir.equalsIgnoreCase("DOWN")) {
                    y -= count;
                } else if (dir.equalsIgnoreCase("L") || dir.equalsIgnoreCase("LEFT")) {
                    x -= count;
                } else if (dir.equalsIgnoreCase("R") || dir.equalsIgnoreCase("RIGHT")) {
                    x += count;
                }
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
       int[] arr= finalPosition("UURR");
       System.out.println(arr[0]+"->"+arr[1]);
    }
}
