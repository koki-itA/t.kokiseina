
import java.io.*;

public class Rei03_k
{
   public static void main (String args[]) throws IOException
   {
      //�L�[�{�[�h������͂��ABufferedReader abc�@�ɓ����

  BufferedReader abc = new BufferedReader (new InputStreamReader (System.in));

           String  su,  su_1, su_2, su_3, su_4, su_5, su_6, su_7, su_8;
   
           int     age,  point1,  sex,  point2, tbc,  point3 , dbt, point5 , bp_1, bp_2, kyf, point6  ;// �����̑����� int �ł��B
       
           double    taizyu , sintyou, point4, goukei;
           
           goukei = 0 ;


        
	System.out.println("�N�����͂��Ă�������");
        System.out.println("�N��(��)                  �_��    ");
        System.out.println("40�`44                      0  ");
        System.out.println("45�`50                      5  ");
	System.out.println("50�`54                      6  ");
        System.out.println("55�`59                      12 ");
        System.out.println("60�`64                      16 ");
        System.out.println("65�`69                      19 ");
        su = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu�ɓ����B
        age = Integer.parseInt(su);
        System.out.println("���Ȃ��̔N���" +  age  + "�Ȃ̂�");
        point1 = check_age(age);
        System.out.println("�|�C���g��" +  point1 + "�ł�") ;
     






        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("���ʂ���͂��Ă�������");
	System.out.println(" ����                   �_�� ");
        System.out.println(" 1.�j��                   6 ");
        System.out.println(" 2.����                   0 ");
        su_1 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_1�ɓ����B
        sex = Integer.parseInt(su_1);
        System.out.println("���Ȃ����������ԍ���" +  sex  + "�Ȃ̂�");
        point2 = check_sex(sex);
        System.out.println("�|�C���g��" +  point2 + "�ł�") ;








        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("���΂����z���Ă��܂����H");
	System.out.println(" �z���Ă���ꍇ             �_�� ");
        System.out.println(" 1.�j��                      4 ");
        System.out.println(" 2.����                      8 ");
        System.out.println(" �z���Ă��Ȃ��ꍇ              ");
        System.out.println(" 3.�j��                      0 ");
	System.out.println(" 4.����                      0 ");
        su_2 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_2�ɓ����B
        tbc = Integer.parseInt(su_2);
        System.out.println("���Ȃ����������ԍ���" +  tbc  + "�Ȃ̂�");
        point3 = check_tbc(tbc);
        System.out.println("�|�C���g��" +  point3 + "�ł�") ;





        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("����BMI�𑪒肵�܂�") ;
        System.out.println("");   
        System.out.println("");
        System.out.println("");

      for ( ; ; )
      {
         System.out.println("�g������͂��Ă�������") ;
         su_3 = abc.readLine() ;
         sintyou = Double.parseDouble(su_3) ; //����omosa��su_3 ������
         
 
         if ( sintyou >= 0 ) break ;
           else
              {
               System.out.println("���̓G���[�ł��A�ē��͂��Ă�������") ;
               }
     }//for

        System.out.println("");   
        System.out.println("");
       

       for ( ; ; )
       {
         System.out.println("�̏d����͂��Ă�������") ;
         su_4 = abc.readLine() ;
         taizyu = Double.parseDouble(su_4) ; //����omosa��su_4 ������
         

           if ( taizyu >= 0 ) break ;
           else
              {
               System.out.println("���̓G���[�ł��A�ē��͂��Ă�������") ;
               }
            }//for
     
        System.out.println("");   
        System.out.println("�얞�x(BMI)             �_�� ");
	System.out.println(" 25�ȉ�                  0   ");
        System.out.println(" 25�`30                  2   ");
        System.out.println(" 30�ȏ�                  3   ");
        System.out.println(" BMI = �̏d(kg) �� �g��(m) ���@�g��(m)");
        point4 = check_bmi(sintyou , taizyu);
        System.out.println("�|�C���g��" +  point4 + "�ł�") ;


           



  
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("���A�a�������Ă��܂����H");
        System.out.println("���A�a             �_�� ");
	System.out.println(" 1.�͂�             7 ");
	System.out.println(" 2.������           0 ");
        su_5 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_5�ɓ����B
        dbt = Integer.parseInt(su_5);
        System.out.println("���Ȃ����������ԍ���" +  dbt  + "�Ȃ̂�");
        point5 = check_dbt(dbt);
        System.out.println("�|�C���g��" +  point5 + "�ł�") ;



    

  
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("�����̐��l����͂��Ă�������");
        System.out.println("");
        System.out.println("                     ����                         �_��   ");
        System.out.println("              120����/80����                       0     ");
	System.out.println("              120�`129/80�`84                      3     ");
	System.out.println(" �~�������   130�`139/85�`89                      6     ");
        System.out.println(" �Ȃ��̏ꍇ   140�`159/90�`99                      8     ");   
        System.out.println("              160�`179/100�`109                    11    ");
        System.out.println("              180�ȏ�/110�ȏ�                      13    ");
        System.out.println("");
        System.out.println(""); 
        System.out.println("              120����/80����                       10    ");
	System.out.println("              120�`129/80�`84                      10    ");
	System.out.println(" �~�������   130�`139/85�`89                      10    ");
        System.out.println(" ����̏ꍇ   140�`159/90�`99                      11    ");   
        System.out.println("              160�`179/100�`109                    11    ");
        System.out.println("              180�ȏ�/110�ȏ�                      15    ");
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("�~����������g���Ă��܂����H");
        System.out.println("1.�͂�(����̏ꍇ)");
        System.out.println("2.������(�Ȃ��̏ꍇ)");
        su_6 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_6�ɓ����B
        kyf = Integer.parseInt(su_6);
        System.out.println("");
        System.out.println("���ɏ�̌�������͂��Ă�������");
        su_7 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_7�ɓ����B
        bp_1 = Integer.parseInt(su_7);
        System.out.println("");
        System.out.println("���ɉ��̌�������͂��Ă�������");
        su_8 = abc.readLine() ; //�L�[�{�[�h���當����̔ԍ����󂯎��Asu_8�ɓ����B
        bp_2 = Integer.parseInt(su_8);
        System.out.println("");
        System.out.println("���Ȃ����������㉺�̌�����" +  bp_1 +  "��" + bp_2 + "�Ȃ̂�");
        point6 = check_bp(kyf,bp_1,bp_2);
        System.out.println("�|�C���g��" +  point6 + "�ł�") ;




       System.out.println("");   
       System.out.println("");
       System.out.println("");
       goukei= goukei+ point1 + point2 + point3+ point4 + point5 + point6 ;
       System.out.println("���Ȃ��̃|�C���g�̍��v��" +  goukei + "�ł�") ;
       System.out.println("");   
       System.out.println("");
       System.out.println("");



       
       System.out.println("  ���v�_��        ���Ǌm��          ���ǔN��(��)         ");   
       System.out.println("                                   �j��        ����      ");
       System.out.println("  10�_�ȉ�        1������           42          47       ");
       System.out.println("  11�`17�_        1�`2������        53          60       ");   
       System.out.println("  18�`22�_        2�`3������        59          67       ");
       System.out.println("  23�`25�_        3�`4������        64          72       ");
       System.out.println("  26�`27�_        4�`5������        67          76       ");   
       System.out.println("  28�`29�_        5�`������         70          80       ");
       System.out.println("   30�_           6�`7������        73          83       ");
       System.out.println("  31,32�_�ȉ�     7�`8������        75          85       ");
       System.out.println("   33�_           8�`9������        77         90�ȏ�    ");   
       System.out.println("   34�_           9�`10������       79         90�ȏ�    ");
       System.out.println("  35�`36�_        10�`12������      82         90�ȏ�    ");
       System.out.println("  37�`39�_        12�`15������      85         90�ȏ�    ");   
       System.out.println("  40�`42�_        15�`20������     90�ȏ�      90�ȏ�    ");
       System.out.println("   43�_           20������         90�ȏ�      90�ȏ�    ");



       System.out.println("");   
       System.out.println("");
       System.out.println("");
       System.out.println("���ʂ͂ǂ��������ł��傤���H");   
       System.out.println("�悭�Ȃ������Ƃ����ꍇ�͓��X�̐����K�����������܂��傤");
       System.out.println("�܂��A����ȂɈ����Ȃ���������Ƃ����āA���f�͋֕��ł�");
       System.out.println("�o�����X�̂Ƃꂽ�O�H��ۂ�A�K�x�ȉ^����S�����܂��傤");   
       System.out.println("�Ƃ͂������ʂ��悩�����̂ł���΂Ȃɂ��ł�");
       System.out.println("���ꂪ�����悤�Ɋ撣��܂��傤");







 }//main

/*********************************************************************************************/

        public static int check_age ( int age ) throws IOException
        {

        int point1, tensu ;

         tensu = 0 ;

        if ( age <=44 )
           {    
             tensu = 0 ;
           } 
          else if ( age <=49 )
              {
                 tensu = 5 ;
              } 
          else if ( age <=54 )
              {
                 tensu = 6 ;
              }
          else if ( age <=59 )
              {
                 tensu = 12 ;
              }
          else if ( age <=64 )
              {
                 tensu = 16 ;
              }
          else  
              {
                 tensu = 19 ;
              }

        point1 = tensu ;

       return point1 ;

       }

/**********************************************************************************************************/


 public static int check_sex ( int sex ) throws IOException
        {

        int point2, tensu2 ;

        tensu2 = 0 ;


        switch  ( sex )
          {
            case 1 :
                    tensu2 = 6 ;
                    break ;
         
            case 2 :
                    tensu2 = 0 ;
                    break ;
           

          }//switch




             point2 = tensu2 ;

             return point2 ;

       }

/**********************************************************************************************************/



   public static int check_tbc ( int tbc ) throws IOException
        {

        int point3, tensu3 ;

        tensu3 = 0 ;

        switch  ( tbc )
          {
            case 1 :
                    tensu3 = 4 ;
                    break ;
         
            case 2 :
                    tensu3 = 8 ;
                    break ;
            case 3 :
                    tensu3 = 0 ;
                    break ;
            case 4 :
                    tensu3 = 0 ;
                    break ;
         


          }//switch


             point3 = tensu3 ;

             return point3 ;

       }

/*************************************************************************************************/



  public static double check_bmi ( double sintyou, double taizyu ) throws IOException
        {

        double  bmi, point4, tensu4 ;

        tensu4 = 0 ;

       
  bmi = taizyu / (sintyou*0.01 * sintyou*0.01) ;

           
             if ( bmi <=25 )
                {
                tensu4 = 0 ;
                }
             else if ( bmi <= 30 )
                   {
                   tensu4 = 2 ;
                   }
             else  
                   {
                     tensu4 = 3 ;
                   }
            
             point4 = tensu4 ;

             return point4 ;

     }

/**********************************************************************************************/



 public static int check_dbt ( int dbt ) throws IOException
        {

        int point5, tensu5 ;

        tensu5 = 0 ;

        switch  ( dbt )
          {
            case 1 :
                    tensu5 = 7 ;
                    break ;
         
            case 2 :
                    tensu5 = 0 ;
                    break ;
         
          }//switch


             point5 = tensu5 ;

             return point5 ;

       }

/*****************************************************************************************************/



    public static int check_bp ( int kyf , int bp_1, int bp_2 ) throws IOException
        {

        int point6, tensu6 ;

        tensu6 = 0 ;



        if (kyf == 2 &&  bp_1 <= 120 &&  bp_2 <= 80  )
        {
         tensu6 = 0;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 6;
        }      
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 <= 120  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 <= 120 &&  bp_2 >= 110  )
        {
         tensu6 = 13;
        }
   else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  && bp_2 <= 80  )
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 3;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
    else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  && bp_2 <= 80  )
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 6;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
    else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  && bp_2 <= 80  )
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 8;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
  else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 2 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 110  ) 
        {
         tensu6 = 13;
        }
   else if (kyf == 2 && bp_1 >= 180 &&  bp_2 <= 80  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 13;
        }      
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 13;
        }
        else if (kyf == 2 && bp_1 >= 180 &&  bp_2 >= 110  )
        {
         tensu6 = 13;
        }
    else if (kyf == 1 &&  bp_1 <= 120 &&  bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 10;
        }      
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 <= 120  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 <= 120 &&  bp_2 >= 110  )
        {
         tensu6 = 15;
        }
   else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  && bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 121  &&   bp_1 <= 129  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
    else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  && bp_2 <= 80  )
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 10;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 130  &&   bp_1 <= 139  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
    else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 140  &&   bp_1 <= 159  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
  else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  && bp_2 <= 80  )
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 81 && bp_2 <= 84  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 85 && bp_2 <= 89  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 90 && bp_2 <= 99  ) 
        {
         tensu6 = 1;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 100 && bp_2 <= 109  ) 
        {
         tensu6 = 11;
        }
        else if (kyf == 1 && bp_1 >= 160  &&   bp_1 <= 179  &&  bp_2 >= 110  ) 
        {
         tensu6 = 15;
        }
   else if (kyf == 1 && bp_1 >= 180 &&  bp_2 <= 80  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 81 && bp_2 <= 84  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 85 && bp_2 <= 89  )
        {
         tensu6 = 15;
        }      
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 90 && bp_2 <= 99  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180  && bp_2 >= 100 && bp_2 <= 109  )
        {
         tensu6 = 15;
        }
        else if (kyf == 1 && bp_1 >= 180 &&  bp_2 >= 110  )
        {
         tensu6 = 15;
        }

        
         
             point6 = tensu6 ;

             return point6 ;
       





/*******************************************************************************************/






}//main
 

}//class
