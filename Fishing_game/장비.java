package port2;

import java.util.*;



public class Àåºñ {

	static int i;
	static Scanner sc = new Scanner(System.in);
	
	public static void ³¬½Ë´ë(Op o) {
		boolean ke = true;
		
		
		System.out.println("======º¸À¯ÁßÀÎ ³¬½Ë´ë======");
		if(o.±âº»³¬½Ë´ë>0) {
			System.out.println();
			System.out.print("±âº»³¬½Ë´ë(³»±¸µµ: "+o.±âº»³¬½Ë´ë+")");
			if(o.ufr == 1) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.°í±Þ³¬½Ë´ë>0) {
			System.out.println();
			System.out.print("°í±Þ³¬½Ë´ë(³»±¸µµ: "+o.°í±Þ³¬½Ë´ë+")");
			if(o.ufr == 2) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.´ë´ÜÇÑ³¬½Ë´ë>0) {
			System.out.println();
			System.out.print("´ë´ÜÇÑ³¬½Ë´ë(³»±¸µµ: "+o.´ë´ÜÇÑ³¬½Ë´ë+")");
			if(o.ufr == 3) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("1.³¬½Ë´ë º¯°æ   2.¸Þ´º");
			while(ke) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 1:
					³¬½Ã´ëch(o);
					ke = false;
					break;
				case 2:
					ke = false;
					break;
				default:
					System.out.println("!1~2");
					break;
				}
			}
		}
		
	

	private static void ³¬½Ã´ëch(Op o) {
		boolean kl = true;
		
		System.out.println("1.±âº»³¬½Ë´ë   2.°í±Þ³¬½Ë´ë   3.´ë´ÜÇÑ³¬½Ë´ë");
		
		while(kl) {
			i = sc.nextInt();
			
			switch(i) {
			case 1: 
				if(o.±âº»³¬½Ë´ë == 0) {
					 System.out.println("º¸À¯ÁßÀÎ ³¬½Ë´ë°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 1) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ³¬½Ë´ëÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 1;
					System.out.println("³¬½Ë´ë°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			case 2:
				if(o.°í±Þ³¬½Ë´ë == 0) {
					 System.out.println("º¸À¯ÁßÀÎ ³¬½Ë´ë°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 2) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ³¬½Ë´ëÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 2;
					System.out.println("³¬½Ë´ë°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			case 3:
				if(o.´ë´ÜÇÑ³¬½Ë´ë == 0) {
					 System.out.println("º¸À¯ÁßÀÎ ³¬½Ë´ë°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.ufr == 3) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ³¬½Ë´ëÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.ufr = 3;
					System.out.println("³¬½Ë´ë°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			}
			
		}
		
	}
	
	public static void Âî(Op o) {
		
		boolean ke = true;
		
		
		System.out.println("======º¸À¯ÁßÀÎ Âî======");
		if(o.±âº»Âî>0) {
			System.out.println();
			System.out.print("±âº»Âî(³»±¸µµ: "+o.±âº»Âî+")");
			if(o.uaf == 1) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.°í±ÞÂî>0) {
			System.out.println();
			System.out.print("°í±ÞÂî(³»±¸µµ: "+o.°í±ÞÂî+")");
			if(o.uaf == 2) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		if(o.½ÅºñÇÑÂî>0) {
			System.out.println();
			System.out.print("½ÅºñÇÑÂî(³»±¸µµ: "+o.½ÅºñÇÑÂî+")");
			if(o.uaf == 3) {
				System.out.println("-»ç¿ë Áß");
			} else {
				System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("1.Âî º¯°æ   2.¸Þ´º");
			while(ke) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 1:
					Âîch(o);
					ke = false;
					break;
				case 2:
					ke = false;
					break;
				default:
					System.out.println("!1~2");
					break;
				}
			}
		}

	public static void Âîch(Op o) {
		boolean kl = true;
		
		System.out.println("1.±âº»Âî   2.°í±ÞÂî   3.½ÅºñÇÑÂî");
		
		while(kl) {
			i = sc.nextInt();
			
			switch(i) {
			case 1: 
				if(o.±âº»Âî == 0) {
					 System.out.println("º¸À¯ÁßÀÎ Âî°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 1) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ÂîÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 1;
					System.out.println("Âî°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			case 2:
				if(o.°í±ÞÂî == 0) {
					 System.out.println("º¸À¯ÁßÀÎ Âî°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 2) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ÂîÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 2;
					System.out.println("Âî°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			case 3:
				if(o.½ÅºñÇÑÂî == 0) {
					 System.out.println("º¸À¯ÁßÀÎ Âî°¡ ¾Æ´Õ´Ï´Ù.");
					 System.out.println();
					 kl = false;
					 break;
				} else if(o.uaf == 3) {
					System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ÂîÀÔ´Ï´Ù.");
					System.out.println();
					kl = false;
					break;
				} else {
					o.uaf = 3;
					System.out.println("Âî°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
					System.out.println();
					kl = false;
				    break;
				}
			}
			
		}
		
	}

	public static void ¹Ì³¢(Op o) {
			
			boolean ke = true;
			
			System.out.println("======º¸À¯ÁßÀÎ ¹Ì³¢======");
			if(o.¶±¹ä>0) {
				System.out.println();
				System.out.print("¶±¹ä(°¹¼ö: "+o.¶±¹ä+")");
				if(o.ub == 1) {
					System.out.println("-»ç¿ë Áß");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			if(o.°¹Áö··ÀÌ>0) {
				System.out.println();
				System.out.print("°¹Áö··ÀÌ(°¹¼ö: "+o.°¹Áö··ÀÌ+")");
				if(o.ub == 2) {
					System.out.println("-»ç¿ë Áß");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			if(o.¹Î¹°»õ¿ì>0) {
				System.out.println();
				System.out.print("¹Î¹°»õ¿ì(°¹¼ö: "+o.¹Î¹°»õ¿ì+")");
				if(o.ub == 3) {
					System.out.println("-»ç¿ë Áß");
				} else {
					System.out.println();
				}
				System.out.println();
			}
			
			System.out.println("1.¹Ì³¢ º¯°æ   2.¸Þ´º");
				while(ke) {
					
					i = sc.nextInt();
					
					switch(i) {
					case 1:
						¹Ì³¢ch(o);
						ke = false;
						break;
					case 2:
						ke = false;
						break;
					default:
						System.out.println("!1~2");
						break;
					}
				}
			}
	
		public static void ¹Ì³¢ch(Op o) {
			boolean kl = true;
			
			System.out.println("0.¹Ì³¢ÇØÁ¦  1.¶±¹ä   2.°¹Áö··ÀÌ   3.¹Î¹°»õ¿ì");
			
			while(kl) {
				
				i = sc.nextInt();
				
				switch(i) {
				case 0: 
					if(o.ub == 0) {
						System.out.println("ÀÌ¹Ì ¹Ì³¢¸¦ »ç¿ë ÁßÀÌ ¾Æ´Õ´Ï´Ù.");
					} else {
						o.ub = 0;
						System.out.println("¹Ì³¢¸¦ ÇØÁ¦ÇÏ¿´½À´Ï´Ù.");
						kl = false;
					} break;
				case 1: 
					if(o.¶±¹ä == 0) {
						 System.out.println("º¸À¯ÁßÀÎ ¹Ì³¢°¡ ¾Æ´Õ´Ï´Ù.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 1) {
						System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ¹Ì³¢ÀÔ´Ï´Ù.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 1;
						System.out.println("¹Ì³¢°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
						System.out.println();
						kl = false;					    
					} break;
				case 2:
					if(o.°¹Áö··ÀÌ == 0) {
						 System.out.println("º¸À¯ÁßÀÎ ¹Ì³¢°¡ ¾Æ´Õ´Ï´Ù.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 2) {
						System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ¹Ì³¢ÀÔ´Ï´Ù.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 2;
						System.out.println("¹Ì³¢°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
						System.out.println();
						kl = false;					    
					} break;
				case 3:
					if(o.¹Î¹°»õ¿ì == 0) {
						 System.out.println("º¸À¯ÁßÀÎ ¹Ì³¢°¡ ¾Æ´Õ´Ï´Ù.");
						 System.out.println();
						 kl = false;
						 break;
					} else if(o.ub == 3) {
						System.out.println("ÇöÀç »ç¿ë ÁßÀÎ ¹Ì³¢ÀÔ´Ï´Ù.");
						System.out.println();
						kl = false;
						break;
					} else {
						o.ub = 3;
						System.out.println("¹Ì³¢°¡ º¯°æµÇ¾ú½À´Ï´Ù.");
						System.out.println();
						kl = false;	   
					} break;
				default:
					System.out.println("!0~3");
					break;	
				}
				
			}
			
		}	

}