################################################################################
# Licensed Materials - Property of IBM
# (C) Copyright IBM Corporation 2024. All Rights Reserved.
#
# Note to U.S. Government Users Restricted Rights:
# Use, duplication or disclosure restricted by GSA ADP Schedule
# Contract with IBM Corp.
################################################################################
from pathlib import Path
from typing import List, Tuple

import nltk
from cldk.analysis.java import JavaAnalysis
from aster.evaluate.naturalness.utils import ComputeNaturalnessScore, AnalyzeCodeForNaturalness


class NaturalnessEvaluator:
    def __init__(self, preprocessor: JavaAnalysis) -> None:
        self.preprocessor = preprocessor
        self.compute_score = ComputeNaturalnessScore(self.preprocessor)
        self.analyze_code = AnalyzeCodeForNaturalness(self.preprocessor)

    def get_naturalness_score_per_test_method(self, qualified_test_class_name: str) -> dict[str, dict[str, float]]:
        """
        Returns the naturalness score per test method
        Args:
            qualified_test_class_name: qualified test class name

        Returns:
            dict[str, dict[str, float]]
            key: test method name
            value: key: different natural metrics, value: naturalness score

        """
        naturalness_score: dict[str, dict[str, float]] = {}
        # Get all the test methods in the test classes
        all_test_methods = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_test_class_name)
        # Go through all the method
        for method in all_test_methods:
            thrown_exceptions = all_test_methods[method].thrown_exceptions
            naturalness_score_per_test_method: dict[str, (float | bool)] = {}
            # Compute all the naturalness metrics
            null_assertion, per_assertion, duplicate_assertion, total_exception_assertion = (
                self.compute_score.compute_assertion_score(all_test_methods[method].code))
            naturalness_score_per_test_method['Assertion complexity'] = per_assertion
            naturalness_score_per_test_method['% of Duplicate Assertions'] = duplicate_assertion
            if null_assertion[0] != 0:
                naturalness_score_per_test_method['No Assertion'] = False
                naturalness_score_per_test_method['% of Null Assertions'] = float(null_assertion[1] / null_assertion[0])
                naturalness_score_per_test_method['% of Exception Assertions'] = float(total_exception_assertion /
                                                                                       null_assertion[0])
            else:
                naturalness_score_per_test_method['% of Null Assertions'] = 0
                naturalness_score_per_test_method['% of Exception Assertions'] = 0
                naturalness_score_per_test_method['No Assertion'] = True
            naturalness_score_per_test_method[
                'Naturalness of variable name'] = self.compute_score.compute_variable_name_closeness_score(
                qualified_test_class_name=qualified_test_class_name, qualified_method_name=method)
            naturalness_score_per_test_method['% of focal method covered'], _ = (
                self.analyze_code.is_focal_method_covered(
                    qualified_test_class_name=qualified_test_class_name, qualified_method_name=method))
            naturalness_score_per_test_method['Naturalness of method name'] = (
                self.compute_score.compute_test_method_name_score(
                    qualified_class_name=qualified_test_class_name,
                    method_name=method,
                    is_method_name_matched=naturalness_score_per_test_method['% of focal method covered'],
                    method_body=all_test_methods[method].code,
                    thrown_exceptions=thrown_exceptions))
            # Only applicable for test class, and focal method options
            naturalness_score_per_test_method['Diversity of literal values'] = 0
            naturalness_score[method] = naturalness_score_per_test_method
        return naturalness_score

    def get_naturalness_score_per_test_class(self, qualified_test_class_name: str) -> dict[str, float]:
        """
        Returns the naturalness score for the given test class
        Args:
            qualified_test_class_name: qualified test class name

        Returns:
            dict[str, float]
            key: different natural metrics, value: naturalness score

        """
        naturalness_score: dict[str, float] = {'% of Null Assertions': 0,
                                               'Naturalness of method name': 0,
                                               'Naturalness of variable name': 0,
                                               '% of focal method covered': 0,
                                               'Diversity of literal values': 0,
                                               'Assertion complexity': 0,
                                               '% of Duplicate Assertions': 0,
                                               '% of Exception Assertions': 0,
                                               'Number of methods': 0
                                               }
        literals: dict[str, List[str]] = {}
        total_null_assertion_score = 0
        total_exception_assertion_score = 0
        total_method_name_closeness = 0
        total_variable_name_closeness = 0
        total_assertion_complexity = 0
        total_duplicate_assertion = 0
        count_is_focal_method_covered = 0
        count_no_assertion = 0
        # Get all the test methods in the test classes
        all_test_methods = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_test_class_name)
        naturalness_score_per_method = self.get_naturalness_score_per_test_method(
            qualified_test_class_name=qualified_test_class_name)
        # Compute the total score for the test class
        for method in naturalness_score_per_method:
            if not naturalness_score_per_method[method]['No Assertion']:
                total_null_assertion_score += naturalness_score_per_method[method]['% of Null Assertions']
                total_exception_assertion_score += naturalness_score_per_method[method]['% of Exception Assertions']
                total_assertion_complexity += naturalness_score_per_method[method]['Assertion complexity']
                total_duplicate_assertion += naturalness_score_per_method[method]['% of Duplicate Assertions']
                literals[method] = self.analyze_code.get_literal_value_per_method(all_test_methods[method].code)
            else:
                count_no_assertion += 1
            if naturalness_score_per_method[method]['% of focal method covered']:
                count_is_focal_method_covered += 1
            total_method_name_closeness += naturalness_score_per_method[method]['Naturalness of method name']
            total_variable_name_closeness += naturalness_score_per_method[method]['Naturalness of variable name']
        if len(all_test_methods) == 0:
            return naturalness_score
        # Make it average by dividing the number of test cases
        methods_with_assertions = len(all_test_methods) - count_no_assertion
        if methods_with_assertions == 0:
            naturalness_score['% of Null Assertions'] = 0
            naturalness_score['% of Exception Assertions'] = 0
            naturalness_score['Assertion complexity'] = 0
            naturalness_score['% of Duplicate Assertions'] = 0
        else:
            naturalness_score['% of Null Assertions'] = float(total_null_assertion_score / methods_with_assertions)
            naturalness_score['% of Exception Assertions'] = float(total_exception_assertion_score /
                                                                   methods_with_assertions)
            naturalness_score['Assertion complexity'] = float(total_assertion_complexity
                                                              / methods_with_assertions)
            naturalness_score['% of Duplicate Assertions'] = float(total_duplicate_assertion
                                                                   / methods_with_assertions)
        naturalness_score['Naturalness of method name'] = float(total_method_name_closeness / len(all_test_methods))
        naturalness_score['Naturalness of variable name'] = float(total_variable_name_closeness / len(all_test_methods))
        naturalness_score['% of focal method covered'] = float(count_is_focal_method_covered
                                                               / len(all_test_methods))

        naturalness_score['% of No Assertion'] = float(count_no_assertion
                                                       / len(all_test_methods))
        # Compute the diversity score
        naturalness_score['Diversity of literal values'] = self.get_literal_diversity_per_focal_method(
            qualified_test_class_name=qualified_test_class_name)
        naturalness_score['Number of methods'] = len(all_test_methods)
        return naturalness_score

    def get_literal_diversity_per_focal_method(self, qualified_test_class_name: str) -> float:
        """
        Compute the literal diversity per focal method
        Args:
            qualified_test_class_name: qualified test class name

        Returns:
            float: literal diversity
        """
        diversity_score = 0.0
        count = 0
        # Focal classes given the test class
        focal_classes = self.analyze_code.identify_focal_class(qualified_test_class_name=qualified_test_class_name)
        # Focal methods per test method
        focal_methods = self.analyze_code.identify_focal_methods(qualified_test_class_name=qualified_test_class_name,
                                                                 focal_classes=focal_classes)
        all_test_methods = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_test_class_name)
        literals: dict[str, List[str]] = {}
        # Get literals per test methods per focal method
        for test_method in focal_methods:
            # Loop through each focal method in the test case
            for focal_method in focal_methods[test_method]:
                test_methods = (
                    self.analyze_code.get_test_methods_given_focal_method(focal_method_details=focal_methods,
                                                                          focal_method=focal_method))
                for method in test_methods:
                    if method in all_test_methods:
                        literals[method] = (
                            self.analyze_code.get_literal_value_per_method(all_test_methods[method].code))
                diversity_score += (
                    self.compute_score.compute_literal_diversity_score(literal_details=literals))
                count += 1
        try:
            return diversity_score / count
        except ZeroDivisionError:
            return 0

    def get_naturalness_score_per_focal_method(self, qualified_test_class_name: str) \
            -> dict[Tuple[str, str], dict[str, float]]:
        """
        Returns the naturalness score per focal method
        Args:
            qualified_test_class_name: qualified test class name

        Returns:
            dict[str, dict[str, float]]
            key: focal method name
            value: key: different natural metrics, value: naturalness score

        """
        # Test methods per focal method
        test_methods_per_focal_method: dict[Tuple[str, str], List[str]] = {}
        naturalness_score: dict[Tuple[str, str], dict[str, float]] = {}
        # Focal classes given the test class
        focal_classes = self.analyze_code.identify_focal_class(qualified_test_class_name=qualified_test_class_name)
        # Focal methods per test method
        focal_methods = self.analyze_code.identify_focal_methods(qualified_test_class_name=qualified_test_class_name,
                                                                 focal_classes=focal_classes)
        all_test_methods = self.preprocessor.get_methods_in_class(
            qualified_class_name=qualified_test_class_name)
        naturalness_score_per_method = self.get_naturalness_score_per_test_method(
            qualified_test_class_name=qualified_test_class_name)
        # Loop through each test method
        for test_method in focal_methods:
            if test_method in naturalness_score_per_method:
                # Loop through each focal method in the test case
                for focal_method in focal_methods[test_method]:
                    if tuple(focal_method) not in naturalness_score:
                        naturalness_score[tuple(focal_method)] = naturalness_score_per_method[test_method]
                    else:
                        temp = {
                            '% of Null Assertions': (naturalness_score[tuple(focal_method)]['% of Null Assertions'] +
                                                     naturalness_score_per_method[test_method]['% of Null Assertions']),
                            '% of Exception Assertions':
                                (naturalness_score[tuple(focal_method)]['% of Exception Assertions'] +
                                 naturalness_score_per_method[test_method]['% of Exception Assertions']),
                            'Assertion complexity': (naturalness_score[tuple(focal_method)]['Assertion complexity'] +
                                                     naturalness_score_per_method[test_method]['Assertion complexity']),
                            '% of Duplicate Assertions': (
                                    naturalness_score[tuple(focal_method)]['% of Duplicate Assertions'] +
                                    naturalness_score_per_method[test_method]['% of Duplicate Assertions']),
                            '% of focal method covered':
                                naturalness_score[tuple(focal_method)]['% of focal method covered'],
                            # Assigned later
                            'Naturalness of method name': (
                                    naturalness_score[tuple(focal_method)]['Naturalness of method name'] +
                                    naturalness_score_per_method[test_method][
                                        'Naturalness of method name']),  # TODO: After the focal name
                            'Naturalness of variable name': (
                                    naturalness_score[tuple(focal_method)]['Naturalness of variable name'] +
                                    naturalness_score_per_method[test_method][
                                        'Naturalness of variable name']),
                            'Diversity of literal values':
                                naturalness_score[tuple(focal_method)]['Diversity of literal values']}  # Assigned later
                        naturalness_score[tuple(focal_method)] = temp
                    # Compute the diversity score for the focal method
                    if tuple(focal_method) not in test_methods_per_focal_method:
                        # Get list of test methods given the focal method
                        test_methods = (
                            self.analyze_code.get_test_methods_given_focal_method(focal_method_details=focal_methods,
                                                                                  focal_method=focal_method))
                        test_methods_per_focal_method[tuple(focal_method)] = test_methods
                        literals: dict[str, List[str]] = {}
                        count_is_focal_method_covered = 0
                        # Get literals per test methods per focal method
                        for method in test_methods:
                            if method in all_test_methods:
                                if naturalness_score_per_method[method]['% of focal method covered']:
                                    count_is_focal_method_covered += 1
                                literals[method] = (
                                    self.analyze_code.get_literal_value_per_method(all_test_methods[method].code))
                        naturalness_score[tuple(focal_method)]['Diversity of literal values'] = (
                            self.compute_score.compute_literal_diversity_score(literal_details=literals))
                        naturalness_score[tuple(focal_method)]['% of focal method covered'] = float(
                            count_is_focal_method_covered / len(test_methods))
        # Average the score by the number of test cases per focal method
        for focal_method in naturalness_score:
            naturalness_score[tuple(focal_method)]['Assertion complexity'] = (
                float(naturalness_score[tuple(focal_method)]['Assertion complexity'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
            naturalness_score[tuple(focal_method)]['% of Duplicate Assertions'] = (
                float(naturalness_score[tuple(focal_method)]['% of Duplicate Assertions'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
            naturalness_score[tuple(focal_method)]['% of Null Assertions'] = (
                float(naturalness_score[tuple(focal_method)]['% of Null Assertions'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
            naturalness_score[tuple(focal_method)]['% of Exception Assertions'] = (
                float(naturalness_score[tuple(focal_method)]['% of Exception Assertions'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
            naturalness_score[tuple(focal_method)]['Naturalness of method name'] = (
                float(naturalness_score[tuple(focal_method)]['Naturalness of method name'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
            naturalness_score[tuple(focal_method)]['Naturalness of variable name'] = (
                float(naturalness_score[tuple(focal_method)]['Naturalness of variable name'] /
                      len(test_methods_per_focal_method[tuple(focal_method)])))
        return naturalness_score
