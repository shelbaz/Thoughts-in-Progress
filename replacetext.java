p    �0   @                 �                              HOe�z%z�W��                                                                                                                                                                                                                                                                                                                                                                                                                                  " + args[0] + " does not exist");
      System.exit(2);
    }

    // Check if target file exists
    File targetFile = new File(args[1]);
    if (targetFile.exists()) {
      System.out.println("Target file " + args[1] + " already exists");
      System.exit(3);
    }

    // Create input and output files
    Scanner input = new Scanner(sourceFile);
    PrintWriter output = new PrintWriter(targetFile);

    while (input.hasNext()) {
      String s1 = input.nextLine();
      String s2 = s1.replaceAll(args[2], args[3]);
      output.println(s2);
    }

    input.close();
    output.close();
  }
}