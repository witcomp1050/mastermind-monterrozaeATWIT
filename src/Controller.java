import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.Arrays;

public class Controller {



    //changes the color of the circles and changes the breaker code into what the user inputs
    public void onClickedEventRed(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }
        //checks to see what row its on, then changes the color of the circles based on the row its on
        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.RED);
                Mastermind.breaker.set(0, 1);

            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.RED);
                Mastermind.breaker.set(1, 1);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.RED);
                Mastermind.breaker.set(2, 1);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.RED);
                Mastermind.breaker.set(3, 1);
            }
        }


        System.out.println(Mastermind.breaker);
    }

    public void onClickedEventYellow(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);

            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.YELLOW);
                Mastermind.breaker.set(0, 2);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.YELLOW);
                Mastermind.breaker.set(1, 2);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.YELLOW);
                Mastermind.breaker.set(2, 2);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.YELLOW);
                Mastermind.breaker.set(3, 2);
            }
        }

        System.out.println(Mastermind.breaker);
    }

    public void onClickedEventGreen(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.GREEN);
                Mastermind.breaker.set(0, 3);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.GREEN);
                Mastermind.breaker.set(1, 3);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.GREEN);
                Mastermind.breaker.set(2, 3);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.GREEN);
                Mastermind.breaker.set(3, 3);
            }
        }

        System.out.println(Mastermind.breaker);
    }

    public void onClickedEventBlue(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.BLUE);
                Mastermind.breaker.set(0, 4);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.BLUE);
                Mastermind.breaker.set(1, 4);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.BLUE);
                Mastermind.breaker.set(2, 4);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.BLUE);
                Mastermind.breaker.set(3, 4);
            }
        }
        System.out.println(Mastermind.breaker);
    }

    public void onClickedEventOrange(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.ORANGE);
                Mastermind.breaker.set(0, 5);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.ORANGE);
                Mastermind.breaker.set(1, 5);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.ORANGE);
                Mastermind.breaker.set(2, 5);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.ORANGE);
                Mastermind.breaker.set(3, 5);
            }
        }
        System.out.println(Mastermind.breaker);
    }

    public void onClickedEventBlack(MouseEvent mouseEvent) {
        if(Mastermind.rowCounter == 0) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircle.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircle.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircle.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircle.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 1) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSR.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSR.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSR.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSR.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 2) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleTR.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleTR.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleTR.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleTR.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 3) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFR.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFR.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFR.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFR.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 4) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleFFR.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleFFR.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleFFR.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleFFR.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 5) {
            if (Mastermind.breaker.get(0) == 0) {
                firstCircleSSR.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                secondCircleSSR.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                thirdCircleSSR.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fourthCircleSSR.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 6) {
            if (Mastermind.breaker.get(0) == 0) {
                fss7.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss7.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts7.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fs7.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 7) {
            if (Mastermind.breaker.get(0) == 0) {
                fs8.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss8.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts8.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss8.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 8) {
            if (Mastermind.breaker.get(0) == 0) {
                fs9.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss9.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts9.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss9.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }

        if(Mastermind.rowCounter == 9) {
            if (Mastermind.breaker.get(0) == 0) {
                fs101.setFill(Color.BLACK);
                Mastermind.breaker.set(0, 6);
            } else if (Mastermind.breaker.get(1) == 0) {
                ss101.setFill(Color.BLACK);
                Mastermind.breaker.set(1, 6);
            } else if (Mastermind.breaker.get(2) == 0) {
                ts101.setFill(Color.BLACK);
                Mastermind.breaker.set(2, 6);
            } else if (Mastermind.breaker.get(3) == 0) {
                fss101.setFill(Color.BLACK);
                Mastermind.breaker.set(3, 6);
            }
        }
        System.out.println(Mastermind.breaker);
    }


//fxml setup
//<editor-fold>
    @FXML public Text mastermindText;
    @FXML public Circle firstPeg;
    @FXML public Circle secondPeg;
    @FXML public Circle thirdPeg;
    @FXML   public Circle fourthPeg2;
    @FXML public Circle secondPeg1;
    @FXML public Circle firstPeg1;
    @FXML public Circle fourthPeg;
    @FXML public Circle thirdPeg1;
    @FXML public Circle fourthPeg1;
    @FXML public Circle firstPeg2;
    @FXML public Circle secondPeg2;
    @FXML public Circle thirdPeg2;
    @FXML public Circle fourthPeg41;
    @FXML public Circle thirdPeg41;
    @FXML public Circle secondPeg41;
    @FXML public Circle firstPeg41;
    @FXML public Circle fourthPeg31;
    @FXML public Circle thirdPeg31;
    @FXML public Circle secondPeg31;
    @FXML public Circle firstPeg31;
    @FXML public Circle fourthPeg21;
    @FXML public Circle thirdPeg21;
    @FXML public Circle secondPeg21;
    @FXML public Circle firstPeg21;
    @FXML public Circle fourthPeg11;
    @FXML public Circle firstPeg3;
    @FXML public Circle secondPeg3;
    @FXML public Circle thirdPeg3;
    @FXML public Circle firstPeg4;
    @FXML public Circle fourthPeg3;
    @FXML public Circle secondPeg4;
    @FXML public Circle thirdPeg4;
    @FXML public Circle fourthPeg4;
    @FXML public Circle thirdPeg5;
    @FXML public Circle secondPeg5;
    @FXML public Circle firstPeg5;
    @FXML public Circle firstPeg11;
    @FXML public Circle fourthPeg5;
    @FXML public Circle thirdPeg11;
    @FXML public Circle secondPeg11;

    @FXML
    private Circle firstCircle;

    @FXML
    private Circle secondCircle;

    @FXML
    private Circle thirdCircle;

    @FXML
    private Circle fourthCircle;

    @FXML
    private Circle firstCircleSR;

    @FXML
    private Circle secondCircleSR;

    @FXML
    private Circle thirdCircleSR;

    @FXML
    private Circle fourthCircleSR;

    @FXML
    private Circle firstCircleTR;

    @FXML
    private Circle secondCircleTR;

    @FXML
    private Circle thirdCircleTR;

    @FXML
    private Circle fourthCircleTR;

    @FXML
    private Circle firstCircleFR;

    @FXML
    private Circle secondCircleFR;

    @FXML
    private Circle thirdCircleFR;

    @FXML
    private Circle fourthCircleFR;

    @FXML
    private Circle firstCircleFFR;

    @FXML
    private Circle secondCircleFFR;

    @FXML
    private Circle thirdCircleFFR;

    @FXML
    private Circle fourthCircleFFR;

    @FXML
    private Circle firstCircleSSR;

    @FXML
    private Circle secondCircleSSR;

    @FXML
    private Circle thirdCircleSSR;

    @FXML
    private Circle fourthCircleSSR;

    @FXML
    private Circle fss7;

    @FXML
    private Circle ss7;

    @FXML
    private Circle ts7;

    @FXML
    private Circle fs7;

    @FXML
    private Circle fss8;

    @FXML
    private Circle ss8;

    @FXML
    private Circle ts8;

    @FXML
    private Circle fs8;

    @FXML
    private Circle fss9;

    @FXML
    private Circle ss9;

    @FXML
    private Circle ts9;

    @FXML
    private Circle fs9;

    @FXML
    private Circle fss101;

    @FXML
    private Circle ss101;

    @FXML
    private Circle ts101;

    @FXML
    private Circle fs101;

    @FXML
    private Button checkButton;
//</editor-fold>

//resets the color back to white
    //tried doing this more efficiently, but couldn't make a getter method or function to get id of circle to change

    public void pegCheck1()
    {
    int[] num = Mastermind.codeCheckRightWrong();
    if (num[0] == 4) {
        firstPeg.setFill(Color.BLACK);
        secondPeg.setFill(Color.BLACK);
        thirdPeg.setFill(Color.BLACK);
        fourthPeg.setFill(Color.BLACK);
    }
    if (num[0] == 3) {
        firstPeg.setFill(Color.BLACK);
        secondPeg.setFill(Color.BLACK);
        thirdPeg.setFill(Color.BLACK);
        if (num[1] == 1)
            fourthPeg.setFill(Color.WHITE);
    }
    if (num[0] == 2) {
        firstPeg.setFill(Color.BLACK);
        secondPeg.setFill(Color.BLACK);
        if (num[1] == 2) {
            thirdPeg.setFill(Color.WHITE);
            fourthPeg.setFill(Color.WHITE);
        } else if (num[1] == 1)
            thirdPeg.setFill(Color.WHITE);

    }
    if (num[0] == 1) {
        firstPeg.setFill(Color.BLACK);
        if (num[1] == 3) {
            secondPeg.setFill(Color.BLACK);
            thirdPeg.setFill(Color.BLACK);
            fourthPeg.setFill(Color.BLACK);
        } else if (num[1] == 2) {
            secondPeg.setFill(Color.BLACK);
            thirdPeg.setFill(Color.BLACK);

        } else if (num[1] == 1) {

            secondPeg.setFill(Color.WHITE);
        }
    }
    if (num[0] == 0) {
        if (num[1] == 4) {
            firstPeg.setFill(Color.WHITE);
            secondPeg.setFill(Color.WHITE);
            thirdPeg.setFill(Color.WHITE);
            fourthPeg.setFill(Color.WHITE);
        } else if (num[1] == 3) {
            firstPeg.setFill(Color.WHITE);
            secondPeg.setFill(Color.WHITE);
            thirdPeg.setFill(Color.WHITE);
        } else if (num[1] == 2) {
            firstPeg.setFill(Color.WHITE);
            secondPeg.setFill(Color.WHITE);
        } else if (num[1] == 1) {
            firstPeg.setFill(Color.WHITE);
        }
    }

}
    public void pegCheck2()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg1.setFill(Color.BLACK);
            secondPeg1.setFill(Color.BLACK);
            thirdPeg1.setFill(Color.BLACK);
            fourthPeg1.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg1.setFill(Color.BLACK);
            secondPeg1.setFill(Color.BLACK);
            thirdPeg1.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg1.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg1.setFill(Color.BLACK);
            secondPeg1.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg1.setFill(Color.WHITE);
                fourthPeg1.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg1.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg1.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg1.setFill(Color.BLACK);
                thirdPeg1.setFill(Color.BLACK);
                fourthPeg1.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg.setFill(Color.BLACK);
                thirdPeg.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg1.setFill(Color.WHITE);
                secondPeg1.setFill(Color.WHITE);
                thirdPeg1.setFill(Color.WHITE);
                fourthPeg1.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg1.setFill(Color.WHITE);
                secondPeg1.setFill(Color.WHITE);
                thirdPeg1.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg1.setFill(Color.WHITE);
                secondPeg1.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg1.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck3()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg2.setFill(Color.BLACK);
            secondPeg2.setFill(Color.BLACK);
            thirdPeg2.setFill(Color.BLACK);
            fourthPeg2.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg2.setFill(Color.BLACK);
            secondPeg2.setFill(Color.BLACK);
            thirdPeg2.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg2.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg2.setFill(Color.BLACK);
            secondPeg2.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg2.setFill(Color.WHITE);
                fourthPeg2.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg2.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg2.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg2.setFill(Color.BLACK);
                thirdPeg2.setFill(Color.BLACK);
                fourthPeg2.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg2.setFill(Color.BLACK);
                thirdPeg2.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg2.setFill(Color.WHITE);
                secondPeg2.setFill(Color.WHITE);
                thirdPeg2.setFill(Color.WHITE);
                fourthPeg2.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg2.setFill(Color.WHITE);
                secondPeg2.setFill(Color.WHITE);
                thirdPeg2.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg2.setFill(Color.WHITE);
                secondPeg2.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg2.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck4()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg3.setFill(Color.BLACK);
            secondPeg3.setFill(Color.BLACK);
            thirdPeg3.setFill(Color.BLACK);
            fourthPeg3.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg3.setFill(Color.BLACK);
            secondPeg3.setFill(Color.BLACK);
            thirdPeg3.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg3.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg3.setFill(Color.BLACK);
            secondPeg3.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg3.setFill(Color.WHITE);
                fourthPeg3.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg3.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg3.setFill(Color.BLACK);
                thirdPeg3.setFill(Color.BLACK);
                fourthPeg3.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg3.setFill(Color.BLACK);
                thirdPeg3.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg3.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg3.setFill(Color.WHITE);
                secondPeg3.setFill(Color.WHITE);
                thirdPeg3.setFill(Color.WHITE);
                fourthPeg3.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg3.setFill(Color.WHITE);
                secondPeg3.setFill(Color.WHITE);
                thirdPeg3.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg3.setFill(Color.WHITE);
                secondPeg3.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg3.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck5()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg4.setFill(Color.BLACK);
            secondPeg4.setFill(Color.BLACK);
            thirdPeg4.setFill(Color.BLACK);
            fourthPeg4.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg4.setFill(Color.BLACK);
            secondPeg4.setFill(Color.BLACK);
            thirdPeg4.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg4.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg4.setFill(Color.BLACK);
            secondPeg4.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg4.setFill(Color.WHITE);
                fourthPeg4.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg4.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg4.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg4.setFill(Color.BLACK);
                thirdPeg4.setFill(Color.BLACK);
                fourthPeg4.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg4.setFill(Color.BLACK);
                thirdPeg4.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg4.setFill(Color.WHITE);
                secondPeg4.setFill(Color.WHITE);
                thirdPeg4.setFill(Color.WHITE);
                fourthPeg4.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg4.setFill(Color.WHITE);
                secondPeg4.setFill(Color.WHITE);
                thirdPeg4.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg4.setFill(Color.WHITE);
                secondPeg4.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg4.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck6()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg5.setFill(Color.BLACK);
            secondPeg5.setFill(Color.BLACK);
            thirdPeg5.setFill(Color.BLACK);
            fourthPeg5.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg5.setFill(Color.BLACK);
            secondPeg5.setFill(Color.BLACK);
            thirdPeg5.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg5.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg5.setFill(Color.BLACK);
            secondPeg5.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg5.setFill(Color.WHITE);
                fourthPeg5.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg5.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg5.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg5.setFill(Color.BLACK);
                thirdPeg5.setFill(Color.BLACK);
                fourthPeg5.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg5.setFill(Color.BLACK);
                thirdPeg5.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg5.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg5.setFill(Color.WHITE);
                secondPeg5.setFill(Color.WHITE);
                thirdPeg5.setFill(Color.WHITE);
                fourthPeg5.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg5.setFill(Color.WHITE);
                secondPeg5.setFill(Color.WHITE);
                thirdPeg5.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg5.setFill(Color.WHITE);
                secondPeg5.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg5.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck7()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg11.setFill(Color.BLACK);
            secondPeg11.setFill(Color.BLACK);
            thirdPeg11.setFill(Color.BLACK);
            fourthPeg11.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg11.setFill(Color.BLACK);
            secondPeg11.setFill(Color.BLACK);
            thirdPeg11.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg11.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg11.setFill(Color.BLACK);
            secondPeg11.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg11.setFill(Color.WHITE);
                fourthPeg11.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg11.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg11.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg11.setFill(Color.BLACK);
                thirdPeg11.setFill(Color.BLACK);
                fourthPeg11.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg11.setFill(Color.BLACK);
                thirdPeg11.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg11.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg11.setFill(Color.WHITE);
                secondPeg11.setFill(Color.WHITE);
                thirdPeg11.setFill(Color.WHITE);
                fourthPeg11.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg11.setFill(Color.WHITE);
                secondPeg11.setFill(Color.WHITE);
                thirdPeg11.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg11.setFill(Color.WHITE);
                secondPeg11.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg11.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck8()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg21.setFill(Color.BLACK);
            secondPeg21.setFill(Color.BLACK);
            thirdPeg21.setFill(Color.BLACK);
            fourthPeg21.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg21.setFill(Color.BLACK);
            secondPeg21.setFill(Color.BLACK);
            thirdPeg21.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg21.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg21.setFill(Color.BLACK);
            secondPeg21.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg21.setFill(Color.WHITE);
                fourthPeg21.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg21.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg21.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg21.setFill(Color.BLACK);
                thirdPeg21.setFill(Color.BLACK);
                fourthPeg21.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg21.setFill(Color.BLACK);
                thirdPeg21.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg21.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg21.setFill(Color.WHITE);
                secondPeg21.setFill(Color.WHITE);
                thirdPeg21.setFill(Color.WHITE);
                fourthPeg21.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg21.setFill(Color.WHITE);
                secondPeg21.setFill(Color.WHITE);
                thirdPeg21.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg21.setFill(Color.WHITE);
                secondPeg21.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg21.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck9()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg31.setFill(Color.BLACK);
            secondPeg31.setFill(Color.BLACK);
            thirdPeg31.setFill(Color.BLACK);
            fourthPeg31.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg31.setFill(Color.BLACK);
            secondPeg31.setFill(Color.BLACK);
            thirdPeg31.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg31.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg31.setFill(Color.BLACK);
            secondPeg31.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg31.setFill(Color.WHITE);
                fourthPeg31.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg31.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg31.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg31.setFill(Color.BLACK);
                thirdPeg31.setFill(Color.BLACK);
                fourthPeg31.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg31.setFill(Color.BLACK);
                thirdPeg31.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg31.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg31.setFill(Color.WHITE);
                secondPeg31.setFill(Color.WHITE);
                thirdPeg31.setFill(Color.WHITE);
                fourthPeg31.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg31.setFill(Color.WHITE);
                secondPeg31.setFill(Color.WHITE);
                thirdPeg31.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg31.setFill(Color.WHITE);
                secondPeg31.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg31.setFill(Color.WHITE);
            }
        }

    }
    public void pegCheck10()
    {
        int[] num = Mastermind.codeCheckRightWrong();
        if(num[0] == 4) {
            firstPeg41.setFill(Color.BLACK);
            secondPeg41.setFill(Color.BLACK);
            thirdPeg41.setFill(Color.BLACK);
            fourthPeg41.setFill(Color.BLACK);
        }
        if(num[0] == 3) {
            firstPeg41.setFill(Color.BLACK);
            secondPeg41.setFill(Color.BLACK);
            thirdPeg41.setFill(Color.BLACK);
            if(num[1] == 1)
                fourthPeg41.setFill(Color.WHITE);
        }
        if(num[0] == 2) {
            firstPeg41.setFill(Color.BLACK);
            secondPeg41.setFill(Color.BLACK);
            if(num[1] == 2) {
                thirdPeg41.setFill(Color.WHITE);
                fourthPeg41.setFill(Color.WHITE);
            }
            else if(num[1] == 1)
                thirdPeg41.setFill(Color.WHITE);

        }
        if(num[0] == 1) {
            firstPeg41.setFill(Color.BLACK);
            if(num[1] == 3)
            {
                secondPeg41.setFill(Color.BLACK);
                thirdPeg41.setFill(Color.BLACK);
                fourthPeg41.setFill(Color.BLACK);
            }
            else if(num[1] == 2)
            {
                secondPeg41.setFill(Color.BLACK);
                thirdPeg41.setFill(Color.BLACK);

            }
            else if(num[1] == 1)
            {

                secondPeg41.setFill(Color.WHITE);
            }
        }
        if(num[0] == 0) {
            if(num[1] == 4)
            {
                firstPeg41.setFill(Color.WHITE);
                secondPeg41.setFill(Color.WHITE);
                thirdPeg41.setFill(Color.WHITE);
                fourthPeg41.setFill(Color.WHITE);
            }
            else if(num[1] == 3)
            {
                firstPeg41.setFill(Color.WHITE);
                secondPeg41.setFill(Color.WHITE);
                thirdPeg41.setFill(Color.WHITE);
            }
            else if(num[1] == 2)
            {
                firstPeg41.setFill(Color.WHITE);
                secondPeg41.setFill(Color.WHITE);
            }else if(num[1] == 1)
            {
                firstPeg41.setFill(Color.WHITE);
            }
        }

    }



    public void check(MouseEvent MouseEvent) {
        int[] num = Mastermind.codeCheckRightWrong();
        System.out.println(Arrays.toString(num));
        if(Mastermind.rowCounter == 0)
            pegCheck1();
        else if(Mastermind.rowCounter == 1)
            pegCheck2();
        else if(Mastermind.rowCounter == 2)
            pegCheck3();
        else if(Mastermind.rowCounter == 3)
            pegCheck4();
        else if(Mastermind.rowCounter == 4)
            pegCheck5();
        else if(Mastermind.rowCounter == 5)
            pegCheck6();
        else if(Mastermind.rowCounter == 6)
            pegCheck7();
        else if(Mastermind.rowCounter == 7)
            pegCheck8();
        else if(Mastermind.rowCounter == 8)
            pegCheck9();
        else if(Mastermind.rowCounter == 9)
            pegCheck10();


        if(Mastermind.codeCheck())
        {
            checkButton.setStyle("-fx-background-color: GREEN");
            mastermindText.setFill(Color.GREEN);
        }
        else {
            Mastermind.rowCounter++;
            Mastermind.breaker.set(0, 0);
            Mastermind.breaker.set(1, 0);
            Mastermind.breaker.set(2, 0);
            Mastermind.breaker.set(3, 0);
            System.out.println(Mastermind.rowCounter);
        }
    }

    public void exit(MouseEvent mouseEvent)
    {
        System.exit(0);
    }



    //reset buttons
    //<editor-fold>
    public void reset(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircle.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset1(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircle.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset2(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircle.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset3(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircle.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset10(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircleSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset11(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircleSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset12(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircleSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset13(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircleSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset20(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircleTR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset21(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircleTR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset22(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircleTR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset23(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircleTR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset30(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircleFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset31(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircleFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset32(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircleFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset33(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircleFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset40(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircleFFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset41(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircleFFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset42(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircleFFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset43(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircleFFR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset50(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        firstCircleSSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset51(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        secondCircleSSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset52(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        thirdCircleSSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset53(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fourthCircleSSR.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset60(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        fss7.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset61(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        ss7.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset62(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        ts7.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset63(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fs7.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset70(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        fs8.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset71(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        ss8.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset72(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        ts8.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset73(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fss8.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset80(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        fs9.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset81(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        ss9.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset82(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        ts9.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset83(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fs9.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset90(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(0,0);
        fs101.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset91(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(1,0);
        ss101.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset92(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(2,0);
        ts101.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    public void reset93(MouseEvent mouseEvent)
    {
        Mastermind.breaker.set(3,0);
        fss101.setFill(Color.rgb(229, 218, 218));
        System.out.println(Mastermind.breaker);
    }
    //</editor-fold>
}
