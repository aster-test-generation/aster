################################################################################
# Licensed Materials - Property of IBM
# (C) Copyright IBM Corporation 2024. All Rights Reserved.
#
# Note to U.S. Government Users Restricted Rights:
# Use, duplication or disclosure restricted by GSA ADP Schedule
# Contract with IBM Corp.
################################################################################
from typing import List, Dict, Tuple
import re
from cldk.analysis.java import JavaAnalysis
from cldk.models.java.models import JCallSite, JCallable

from aster.utils import constants


class AnalyzeCodeForNaturalness:
    def __init__(self, preprocessor: JavaAnalysis) -> None:
        self.preprocessor = preprocessor

    def get_test_method_names(self, qualified_class_name: str) -> Dict[str, str]:
        """
        Given a test class returns the test method names and their corresponding body
        Args:
            qualified_class_name: qualified class name

        Returns:
            Dict[str, str]
            returns the test method names and their corresponding body

        """
        test_method_names: Dict[str, str] = {}
        method_details = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_class_name)
        for method_name in method_details:
            test_method_names[method_name] = method_details[method_name].code
        return test_method_names

    def get_variable_details(self, qualified_class_name: str) -> Tuple[Dict[str, List[str]], Dict[str, List[str]]]:
        """
        Step 1. Get all the class fields and store the type and initialization details
        Step 2. Get all the methods in the class
        Step 3. For each method, get all the variables declared in the method, their type and initialization details.
        Step 4. For all the variables that are passed as arguments in the method, try to get the formal argument names
        Step 5. Add that details to the variables list
        Given a test class returns the variable names and their corresponding type, initialization, and
        formal parameters of the methods where those variables are being passed as arguments
        Args:
            qualified_class_name: qualified class name

        Returns:
            Tuple[Dict[str, List[str]], Dict[str, List[str]]]:
            1st element: [variable_name (qualified name), [fully qualified_type, initialization_value]]
            2nd element: details from call site [method name, List[method signature]]
            returns the variable names and their corresponding type (fully qualified) and initialization
        """
        variable_details: Dict[str, List[str]] = {}
        call_site_signature: Dict[str, List[str]] = {}
        # Step 1. Get all the class fields and store the type and initialization details
        # Get the class field details
        field_variable_details = self.preprocessor.get_class(
            qualified_class_name=qualified_class_name).field_declarations
        for field in field_variable_details:
            field_type = field.type
            declaration = ''  # TODO: Add class field declaration
            for field_name in field.variables:
                variable_details[qualified_class_name + '.' + field_name] = [field_type, declaration]
        # Get the method variables
        # Step 2. Get all the methods in the class
        method_details = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_class_name)
        # Step 3. For each method, get all the variables declared in the method, their type and initialization details.
        for method in method_details:
            call_site_signature[method] = []
            for variable in method_details[method].variable_declarations:
                variable_details[qualified_class_name + '.' + method + '.' + variable.name] = \
                    [variable.type, variable.initializer]
            for call_site in method_details[method].call_sites:
                matched_method_signatures = self.get_matching_methods_signature(
                    qualified_class_name=call_site.receiver_type,
                    method_name=call_site.method_name, arguments=call_site.argument_types)
                if len(matched_method_signatures) > 0:
                    for method_signature in matched_method_signatures:
                        if method_signature not in call_site_signature[method]:
                            call_site_signature[method].append(method_signature)
        return variable_details, call_site_signature

    def get_matching_methods_signature(self, qualified_class_name: str,
                                       method_name: str,
                                       arguments: List[str]) -> List[str]:
        """
        Giving class name, method name and arguments, identify the matched method signatures
        Args:
            qualified_class_name: qualified class name
            method_name: method name
            arguments: argument types

        Returns:
            List[str]: matched method names
        """
        matching_method_signatures: List[str] = []
        # Match with the class and method signature
        methods = self.preprocessor.get_methods_in_class(qualified_class_name=qualified_class_name)
        # If match is found
        if len(methods) > 0:
            for method in methods:
                method_name_in_class = method.split('(')[0]
                if method_name_in_class == method_name:
                    if len(methods[method].parameters) == len(arguments):
                        matching_method_signatures.append(method)
        # Match not found
        else:
            # Try to find in the known API calls
            api_methods = self.get_known_library_method_signature(method_name=method_name)
            # Matching criteria as of now is the method name and the number of arguments
            for api_method_signatures in api_methods:
                if len(api_method_signatures) == len(arguments):
                    matching_method_signatures.append(method_name + '(' + ', '.join(api_method_signatures) + ')')
        return matching_method_signatures

    @staticmethod
    def get_literal_value_per_method(method_body: str) -> List[str]:
        """
        Given a test class, returns the literal value per test method
        Args:
            method_body: body of the test method

        Returns:

        """
        pattern = r'"(.*?)"'
        # Find all matches in the input string
        literals = re.findall(pattern, method_body)
        return literals

    @staticmethod
    def find_close_and_exact_focal_methods(call_site: JCallSite, all_methods_in_focal_class: dict[str, JCallable],
                                           focal_method_exact_match: dict,
                                           focal_class: str, focal_method_close_matches: dict) -> Tuple[dict, dict]:
        """
        Helper function to find closed and exact focal methods
        Args:
            call_site: call site information
            all_methods_in_focal_class: all methods in the focal class
            focal_method_exact_match: previously found exact focal methods
            focal_class: focal class
            focal_method_close_matches:  previously found closely matched focal methods

        Returns:
            Tuple[dict, dict]
            Returns the exact and closely matched focal methods
        """
        argument_types_at_call_site = call_site.argument_types
        number_of_arguments_at_call_site = len(argument_types_at_call_site)
        # Go through all the methods in the focal class
        for method_in_focal_class in all_methods_in_focal_class:
            method_name = method_in_focal_class.split('(')[0]
            # Check if method name is matched
            if method_name == call_site.method_name:
                is_exact_matched = True
                # Check if the number of parameters are the same
                if len(all_methods_in_focal_class[
                           method_in_focal_class].parameters) == number_of_arguments_at_call_site:
                    # Go through all the parameters
                    for i in range(0, number_of_arguments_at_call_site):
                        if (all_methods_in_focal_class[method_in_focal_class].parameters[i].type !=
                                argument_types_at_call_site[i] and argument_types_at_call_site[i]!=''):
                            is_exact_matched = False
                        # If exact match
                    if is_exact_matched:
                        focal_method_exact_match[(call_site.start_line,
                                                  call_site.start_column)] = \
                            [focal_class, method_in_focal_class]
                # Store the close match. Mostly in case of method overloading
                # and not able to resolve the types correctly
                if not is_exact_matched:
                    if (call_site.start_line, call_site.start_column) not in focal_method_exact_match:
                        if (call_site.start_line, call_site.start_column) not in focal_method_exact_match:
                            focal_method_close_matches[(call_site.start_line,
                                                        call_site.start_column)] = \
                                [[focal_class, method_in_focal_class]]
                        else:
                            focal_method_close_matches[(call_site.start_line,
                                                        call_site.start_column)] = \
                                focal_method_close_matches[(call_site.start_line,
                                                            call_site.start_column)].append(
                                    [focal_class, method_in_focal_class])
        return focal_method_exact_match, focal_method_close_matches

    @staticmethod
    def find_max_line_column(dictionary: dict) -> tuple[int, int]:
        all_lines = [line[0] for line in list(dictionary.keys())]
        last_call_site_line = max(all_lines)
        all_columns = [line[1] for line in list(dictionary.keys())
                       if line[0] == last_call_site_line]
        last_call_site_column = max(all_columns)
        return last_call_site_line, last_call_site_column

    @staticmethod
    def get_java_primitive_types():
        """
        List of Java primitive types
        Returns:

        """
        # TODO: Utils class, Apache commons collection, JSON objects
        return ['java.lang.Boolean', 'java.lang.Byte', 'java.lang.Character', 'java.lang.Double',
                'java.lang.Float', 'java.lang.java.lang.Integer', 'java.lang.Long', 'java.lang.Short',
                'java.lang.String', 'int', 'float', 'double', 'char', 'long', 'boolean', 'byte']

    @staticmethod
    def get_known_library_method_signature(method_name: str) -> List[str]:
        """
        Given the method name, returns the method signature from the known libraries
        Returns:
            str: method signature
        """
        library_method_signature = \
            {
                'assertArrayEquals': [['java.lang.Byte[] expecteds, java.lang.Byte[] actuals'],
                                      ['java.lang.Char[] expecteds, java.lang.Char[] actuals'],
                                      ['java.lang.Double[] expecteds, java.lang.Double[] actuals, '
                                       'java.lang.Double delta'],
                                      ['java.lang.Float[] expecteds, java.lang.Float[] actuals, '
                                       'java.lang.Float delta'],
                                      ['java.lang.Integer[] expecteds, java.lang.Integer[] actuals'],
                                      ['java.lang.Long[] expecteds, java.lang.Long[] actuals'],
                                      ['java.lang.Object[] expecteds, java.lang.Object[] actuals'],
                                      ['short[] expecteds, short[] actuals'],
                                      [' java.lang.String message, java.lang.Byte[] expecteds, '
                                       'java.lang.Byte[] actuals'],
                                      [' java.lang.String message, java.lang.Char[] expecteds, '
                                       'java.lang.Char[] actuals'],
                                      [' java.lang.String message, java.lang.Double[] expecteds, '
                                       'java.lang.Double[] actuals, java.lang.Double delta'],
                                      [' java.lang.String message, java.lang.Float[] expecteds, '
                                       'java.lang.Float[] actuals, java.lang.Float delta'],
                                      [' java.lang.String message, java.lang.Integer[] expecteds, '
                                       'java.lang.Integer[] actuals'],
                                      [' java.lang.String message, java.lang.Long[] expecteds, '
                                       'java.lang.Long[] actuals'],
                                      [' java.lang.String message, java.lang.Object[] expecteds, '
                                       'java.lang.Object[] actuals'],
                                      [' java.lang.String message, short[] expecteds, short[] actuals']
                                      ],
                'assertEquals': [['java.lang.Double expected, java.lang.Double actual'],
                                 ['java.lang.Double expected, java.lang.Double actual, java.lang.Double '
                                  'delta'],
                                 ['java.lang.Long expected, java.lang.Long actual'],
                                 ['java.lang.Object[] expecteds, java.lang.Object[] actuals'],
                                 ['java.lang.Object expected, java.lang.Object actual'],
                                 [' java.lang.String message, java.lang.Double expected, java.lang.Double '
                                  'actual'],
                                 [' java.lang.String message, java.lang.Double expected, java.lang.Double '
                                  'actual, java.lang.Double delta'],
                                 [' java.lang.String message, java.lang.Long expected, java.lang.Long '
                                  'actual'],
                                 [' java.lang.String message, java.lang.Object[] expecteds, '
                                  'java.lang.Object[] actuals'],
                                 [' java.lang.String message, java.lang.Object expected, java.lang.Object '
                                  'actual']],
                'assertFalse': [['boolean condition'],
                                ['java.lang.String message, boolean condition']],
                'assertNotNull': [['java.lang.Object object'],
                                  ['java.lang.String message, java.lang.Object object']],
                'assertNotSame': [['java.lang.Object unexpected, java.lang.Object actual'],
                                  ['java.lang.String message, java.lang.Object unexpected, '
                                   'java.lang.Object actual']],
                'assertNull': [['java.lang.Object object'],
                               ['java.lang.String message, java.lang.Object object']],
                'assertSame': [['java.lang.Object expected, java.lang.Object actual'],
                               ['java.lang.String message, java.lang.Object expected, java.lang.Object '
                                'actual']],
                'assertThat': [['java.lang.String reason, T actual, Matcher<T> matcher'],
                               ['assertThat(T actual, Matcher<T> matcher']],
                'assertTrue': [['boolean condition'],
                               ['java.lang.String message, boolean condition']],
                'fail': [['java.lang.String message']]}

        if method_name in library_method_signature:
            return library_method_signature[method_name]
        else:
            return []

    def is_focal_method_covered(self, qualified_test_class_name: str,
                                qualified_method_name: str) -> tuple[bool, str]:
        """
        Given the test class and the test method name, checks, whether the name of the test covers the focal method
        Args:
            qualified_test_class_name: qualified test class name
            qualified_method_name: method name

        Returns:
            tuple[bool, tuple[str, str]]:
            first element: True if the name of the test covers the focal method
            second element: matched focal method
        """
        focal_classes = self.identify_focal_class(qualified_test_class_name=qualified_test_class_name)
        # Focal methods per test method
        focal_methods = self.identify_focal_methods(qualified_test_class_name=qualified_test_class_name,
                                                    focal_classes=focal_classes)
        # Check if the method under test is in the list of focal methods returned given the test class
        if qualified_method_name in focal_methods:
            test_method_name = qualified_method_name.split('(')[0]
            focal_methods_given_test_method = focal_methods[qualified_method_name]
            # Go through all the focal methods
            for focal_method_given_test_method in focal_methods_given_test_method:
                # Check if the focal method name is in the test name
                if focal_method_given_test_method[1].split('(')[0].lower() in test_method_name.lower():
                    return True, focal_method_given_test_method[1]
        return False, ''

    @staticmethod
    def get_test_methods_given_focal_method(focal_method_details: dict[str, list[tuple[str, str]]],
                                            focal_method: Tuple[str, str]) -> List[str]:
        """
        Given focal method details return the test methods
        Args:
            focal_method_details:
            focal_method:

        Returns:

        """
        test_methods = []
        for method_name in focal_method_details:
            if focal_method in focal_method_details[method_name]:
                test_methods.append(method_name)
        return test_methods

    def identify_focal_class(self, qualified_test_class_name: str) -> List[str]:
        """
        Given a qualified test class, identify the focal class(es)
        Args:
            qualified_test_class_name: qualified class name

        Returns:

        """
        exact_match_focal_class = ''
        close_match = []
        application_classes = self.preprocessor.get_classes()
        classes_under_same_package = []

        # Package name of the test class
        package_name = '.'.join(qualified_test_class_name.split('.')[:-1])

        # Identify all the application classes that are in the same package
        for class_name in application_classes:
            if package_name in class_name and 'Test' not in class_name and 'test' not in class_name:
                classes_under_same_package.append(class_name.split('.')[-1])

        # ASTER specific logic
        if constants.TEST_PREFIX in qualified_test_class_name:
            focal_class_name = qualified_test_class_name.split('.')[-1].replace(constants.TEST_PREFIX, '').split('_')[0]
            if focal_class_name in classes_under_same_package:
                exact_match_focal_class = package_name + '.' + focal_class_name
        # EvoSuite specific logic
        if constants.EVOSUITE_TEST_SUFFIX in qualified_test_class_name:
            focal_class_name = \
                qualified_test_class_name.split('.')[-1].split('_')[0]
            if focal_class_name in classes_under_same_package:
                exact_match_focal_class = package_name + '.' + focal_class_name
        # Generic method
        if exact_match_focal_class == '':
            test_class_name = (qualified_test_class_name.split('.')[-1]
                               .replace('Test', '').replace('test', '')).rstrip('_').strip()
            if test_class_name in classes_under_same_package:
                exact_match_focal_class = package_name + '.' + test_class_name
            if exact_match_focal_class == '':
                if '_Test' in qualified_test_class_name:
                    test_class_name = (qualified_test_class_name.split('.')[-1].
                    split('_Test')[0].split('_')[-1]).replace('_Test', '')
                    if test_class_name in classes_under_same_package:
                        exact_match_focal_class = package_name + '.' + test_class_name
            if exact_match_focal_class == '':
                for class_name in classes_under_same_package:
                    if test_class_name in class_name:
                        close_match.append(class_name)
        if exact_match_focal_class == '':
            return close_match
        else:
            return [exact_match_focal_class]

    def identify_focal_methods(self, qualified_test_class_name: str,
                               focal_classes: List[str]) -> Dict[str, List[Tuple[str, str]]]:
        """
        Identify focal methods for each test method
        Args:
            qualified_test_class_name: qualified test class name
            focal_classes: List of focal classes, in case, we do not find one exact match

        Returns:
            Dict[str, List[Tuple[str, str]]]:
            Key: qualified test method name
            Value: List[Tuple[fully qualified class name, focal method name]]
        """
        focal_methods_dict = {}
        all_methods = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_test_class_name)
        for method in all_methods:
            call_sites = all_methods[method].call_sites
            # Run through all the focal classes
            for focal_class in focal_classes:
                focal_method_exact_match = {}
                focal_method_close_matches = {}
                # Identify all methods in the focal class
                all_methods_in_focal_class = self.preprocessor.get_methods_in_class(
                    qualified_class_name=focal_class)
                # For each call in the test method
                for call_site in call_sites:
                    # If the calling type is in the focal class
                    if call_site.receiver_type in focal_classes:
                        focal_method_exact_match, focal_method_close_matches = (
                            self.find_close_and_exact_focal_methods(call_site,
                                                                    all_methods_in_focal_class,
                                                                    focal_method_exact_match,
                                                                    focal_class,
                                                                    focal_method_close_matches))
                # If we found some exact match
                if len(focal_method_exact_match) > 0:
                    # Identify the class call site on the focal class -- Heuristics
                    last_call_site_line, last_call_site_column = (
                        self.find_max_line_column(focal_method_exact_match))
                    if method not in focal_methods_dict:
                        focal_methods_dict[method] = [focal_method_exact_match[(last_call_site_line,
                                                                                last_call_site_column)]]
                    else:
                        if (focal_method_exact_match[(last_call_site_line, last_call_site_column)]
                                not in focal_methods_dict[method]):
                            focal_methods_dict[method].append(focal_method_exact_match[(last_call_site_line,
                                                                                            last_call_site_column)])
                    for exact_match in focal_method_exact_match:
                        if focal_method_exact_match[exact_match][1].split('(')[0].lower() in method.lower():
                            if method not in focal_methods_dict:
                                focal_methods_dict[method] = [focal_method_exact_match[exact_match]]
                            else:
                                if focal_method_exact_match[exact_match] not in focal_methods_dict[method]:
                                    focal_methods_dict[method].append(focal_method_exact_match[exact_match])
                else:
                    if len(focal_method_close_matches) > 0:
                        last_call_site_line, last_call_site_column = (
                            self.find_max_line_column(focal_method_close_matches))
                        if method not in focal_methods_dict:
                            focal_methods_dict[method] = focal_method_close_matches[
                                (last_call_site_line, last_call_site_column)]
                        else:
                            if focal_method_close_matches[(last_call_site_line, last_call_site_column)] not in \
                                    focal_methods_dict[method]:
                                focal_methods_dict[method].append(
                                        focal_method_close_matches[(last_call_site_line, last_call_site_column)])
                        # for exact_match in focal_method_close_matches:
                        #     if focal_method_close_matches[exact_match][1].split('(')[0] in method:
                        #         if method not in focal_methods_dict:
                        #             focal_methods_dict[method] = [focal_method_close_matches[exact_match]]
                        #         else:
                        #             if focal_method_close_matches[exact_match] not in focal_methods_dict[method]:
                        #                 focal_methods_dict[method].append(focal_method_close_matches[exact_match])
        return focal_methods_dict
