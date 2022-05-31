| ID  | Project    | Package                                  | Class                            | Method                                                                                | TO |
| --- | ---------- | ---------------------------------------- | -------------------------------- | ------------------------------------------------------------------------------------- | -- |
| M1  | JFreeChart | org.jfree.chart                          | ChartPanel.java                  | mouseReleased(MouseEvent)                                                             | 1  |
| M2  | JFreeChart | org.jfree.chart                          | ChartPanel.java                  | generateSVG(int, int)                                                                 | 1  |
| M3  | JFreeChart | org.jfree.chart                          | JFreeChart.java                  | createAlignedRectangle2D(Size2D, Rectangle2D, HorizontalAlignment, VerticalAlignment) | 2  |
| M4  | JFreeChart | org.jfree.chart.annotations              | XYBoxAnnotation.java             | draw(Graphics2D, XYPlot, Rectangle2D, ValueAxis, ValueAxis, int, PlotRenderingInfo)   | 2  |
| M5  | JFreeChart | org.jfree.chart.annotations              | XYDrawableAnnotation.java        | draw(Graphics2D, XYPlot, Rectangle2D, ValueAxis, ValueAxis, int, PlotRenderingInfo)   | 2  |
| M6  | JFreeChart | org.jfree.chart.axis                     | Axis.java                        | drawAxisLine(Graphics2D, double, Rectangle2D, RectangleEdge)                          | 2  |
| M7  | JFreeChart | org.jfree.chart.axis                     | CategoryAxis.java                | draw(Graphics2D, double, Rectangle2D, Rectangle2D, RectangleEdge, PlotRenderingInfo)  | 1  |
| M8  | JFreeChart | org.jfree.chart.encoders                 | SunJPEGEncoderAdapter.java       | encode(BufferedImage, OutputStream)                                                   | 2  |
| M9  | JFreeChart | org.jfree.chart.panel                    | CrosshairOverlay.java            | calculateLabelPoint(Line2D, RectangleAnchor, double, double)                          | 2  |
| M10 | Weka       | weka.associations                        | Apriori.java                     | getTechnicalInformation()                                                             | 2  |
| M11 | Weka       | weka.associations                        | FPGrowth.java                    | parseTransactionsMustContain(Instances)                                               | 1  |
| M12 | Weka       | weka.associations                        | FPGrowth.java                    | getPremise(FrequentBinaryItemSet, boolean\[\])                                        | 2  |
| M13 | Weka       | weka.associations                        | FPGrowth.java                    | buildFPTree(ArrayList<BinaryItem>, Object, int)                                       | 1  |
| M14 | Weka       | weka.attributeSelection                  | CfsSubsetEval.java               | postProcess(int\[\])                                                                  | 1  |
| M15 | Weka       | weka.attributeSelection                  | Ranker.java                      | search(ASEvaluation, Instances)                                                       | 1  |
| M16 | Weka       | weka.classifiers                         | BVDecomposeSegCVSub.java         | getTechnicalInformation()                                                             | 2  |
| M17 | Weka       | weka.classifiers.bayes.net               | ParentSet.java                   | deleteParent(int, Instances)                                                          | 1  |
| M18 | Weka       | weka.classifiers.bayes.net               | ParentSet.java                   | addParent(int, int, Instances)                                                        | 1  |
| M19 | Weka       | weka.classifiers.evaluation              | Evaluation.java                  | evaluationForSingleInstance(double\[\], Instance, boolean)                            | 1  |
| M20 | Weka       | weka.classifiers.evaluation              | Evaluation.java                  | evaluationForSingleInstance(Classifier, Instance, boolean)                            | 1  |
| M21 | Weka       | weka.classifiers.functions               | SGD.java                         | distributionForInstance(Instance)                                                     | 1  |
| M22 | Weka       | weka.classifiers.functions               | SGDText.java                     | distributionForInstance(Instance)                                                     | 2  |
| M23 | Weka       | weka.classifiers.functions               | SMO.java                         | checkClassifier()                                                                     | 4  |
| M24 | Weka       | weka.classifiers.functions.neural        | NeuralConnection.java            | connect(NeuralConnection, NeuralConnection)                                           | 1  |
| M25 | Weka       | weka.classifiers.functions.supportVector | StringKernel.java                | kernelHelperLP(int, char\[\], int, char\[\], int, int)                                | 1  |
| M26 | Weka       | weka.classifiers.lazy.kstar              | KStarNominalAttribute.java       | transProb()                                                                           | 1  |
| M27 | Weka       | weka.classifiers.lazy.kstar              | KStarNumericAttribute.java       | transProb()                                                                           | 1  |
| M28 | Weka       | weka.classifiers.meta                    | AdaBoostM1.java                  | toString()                                                                            | 2  |
| M29 | Weka       | weka.classifiers.meta                    | ClassificationViaRegression.java | buildClassifier(Instances)                                                            | 1  |
| M30 | Weka       | weka.classifiers.meta                    | CVParameterSelection.java        | findParamsByCrossValidation(int, Instances, Random)                                   | 2  |
| M31 | Weka       | weka.classifiers.meta                    | FilteredClassifier.java          | distributionForInstance(Instance)                                                     | 2  |
| M32 | Weka       | weka.classifiers.meta                    | FilteredClassifier.java          | resampleAttributes(Instances, boolean, Random)                                        | 3  |
| M33 | Weka       | weka.classifiers.pmml.consumer           | NeuralNetwork.java               | distributionForInstance(Instance)                                                     | 3  |
| M34 | Weka       | weka.classifiers.trees                   | RandomTree.java                  | distributionForInstance(Instance)                                                     | 3  |
| M35 | Weka       | weka.classifiers.trees                   | REPTree.java                     | leafString(Tree)                                                                      | 2  |
| M36 | Weka       | weka.classifiers.trees.ht                | InfoGainSplitMetric.java         | evaluateSplit(Map<String, WeightMass>, List<Map<String, WeightMass>>)                 | 2  |
| M37 | Weka       | weka.clusterers                          | Cobweb.java                      | getTechnicalInformation()                                                             | 2  |
| M38 | Weka       | weka.clusterers                          | FarthestFirst.java               | difference(int, double, double)                                                       | 1  |
| M39 | Weka       | weka.core                                | Capabilities.java                | main(String\[\])                                                                      | 3  |
| M40 | Weka       | weka.core                                | Statistics.java                  | incompleteGammaComplement(double, double)                                             | 1  |
| M41 | Weka       | weka.core                                | Statistics.java                  | normalInverse(double)                                                                 | 2  |
| M42 | Weka       | weka.core                                | TestInstances.java               | main(String\[\])                                                                      | 2  |
| M43 | Weka       | weka.core.converters                     | DatabaseLoader.java              | newDatabaseConnection()                                                               | 1  |
| M44 | Weka       | weka.core.xml                            | XMLInstances.java                | headerFromXML()                                                                       | 2  |
| M45 | Xerces     | org.apache.html.dom                      | NameNodeListImpl.java            | nextMatchingElementAfter(Node)                                                        | 1  |
| M46 | Xerces     | org.apache.xerces.dom                    | DeepNodeListImpl.java            | nextMatchingElementAfter(Node)                                                        | 1  |
| M47 | Xerces     | org.apache.xerces.dom                    | DeepNodeListImpl.java            | item(int)                                                                             | 1  |
| M48 | Xerces     | org.apache.xerces.dom                    | DeferredDocumentImpl.java        | lookupElementDefinition(String)                                                       | 2  |
| M49 | Xerces     | org.apache.xerces.dom                    | DOMImplementationSourceImpl.java | testImpl(DOMImplementation, String)                                                   | 1  |
| M50 | Xerces     | org.apache.xerces.dom                    | ObjectFactory.java               | findProviderClass(String, ClassLoader, boolean)                                       | 2  |
| M51 | Xerces     | org.apache.xerces.dom                    | TreeWalkerImpl.java              | previousNode()                                                                        | 2  |
| M52 | Xerces     | org.apache.xerces.impl                   | XML11EntityScanner.java          | skipSpaces()                                                                          | 2  |
| M53 | Xerces     | org.apache.xerces.impl.dtd               | XMLDTDDescription.java           | equals(Object)                                                                        | 1  |
| M54 | Xerces     | org.apache.xerces.impl.dtd               | DTDGrammar.java                  | getElementContentModelValidator(int)                                                  | 1  |
| M55 | Xerces     | org.apache.xerces.impl.dv.util           | Base64.java                      | decode(String)                                                                        | 3  |
| M56 | Xerces     | org.apache.xerces.impl.dv.xs             | XSSimpleTypeDecl.java            | normalize(Object, short)                                                              | 1  |
| M57 | Xerces     | org.apache.xerces.impl.dv.xs             | AbstractDateTimeDV.java          | compareDates(DateTimeData, DateTimeData, boolean)                                     | 4  |
| M58 | Xerces     | org.apache.xerces.impl.xs                | XSModelImpl.java                 | getComponentsByNamespace(short, String)                                               | 2  |