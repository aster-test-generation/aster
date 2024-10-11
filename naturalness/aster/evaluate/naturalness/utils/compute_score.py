################################################################################
# Licensed Materials - Property of IBM
# (C) Copyright IBM Corporation 2024. All Rights Reserved.
#
# Note to U.S. Government Users Restricted Rights:
# Use, duplication or disclosure restricted by GSA ADP Schedule
# Contract with IBM Corp.
################################################################################
import re
from typing import List, Tuple, Dict
import nltk
from cldk.analysis.java import JavaAnalysis
from nltk import word_tokenize, ngrams
from aster.evaluate.naturalness.utils import AnalyzeCodeForNaturalness
from aster.utils.treesitter import TreeSitter
nltk.download('punkt', quiet=True)
nltk.download('punkt_tab', quiet=True)
nltk.download('stopwords', quiet=True)

class ComputeNaturalnessScore:
    def __init__(self, preprocessor: JavaAnalysis):
        self.preprocessor = preprocessor
        self.analyze = AnalyzeCodeForNaturalness(self.preprocessor)

    @staticmethod
    def generate_ngrams(text: str, n: int) -> List[Tuple[str]]:
        """
        Generate n-gram tuples
        Args:
            text: input text
            n: number of ngrams
        Returns:

        """
        words = word_tokenize(text)
        return list(ngrams(words, n))

    @staticmethod
    def compute_assertion_score(method_body: str) -> tuple[List[int], float, float]:
        """
        Given a method body compute the percentage of null assertions
        Args:
            method_body: test method body

        Returns:
            tuple[List[int], float, float]:
            [total number of assertions, number of null assertions]
            [percentage of lines has assertions]
            [duplicate assertions]

        """
        total_assertion = 0
        total_null_assertion = 0
        total_exception_assertion = 0
        assertions, _ = TreeSitter().separate_assertions_new(method_body)
        # Total number of duplicate assertions
        s = set(assertions.splitlines())
        duplicate = len(assertions.splitlines()) - len(s)
        for assertion in assertions.splitlines():
            if 'assert' in assertion or 'fail(' in assertion or 'verify(' in assertion or 'verifyException' in assertion:
                total_assertion += 1
            if 'assertNotNull' in assertion or 'assertNull' in assertion:
                total_null_assertion += 1
            if 'fail(' in assertion or 'verifyException' in assertion:
                total_exception_assertion += 1
        null_assertions = [total_assertion, total_null_assertion]
        duplicate_assertions = 0.0 if total_assertion == 0 else float(duplicate / total_assertion)
        if len(method_body.splitlines()) == 0:
            per_assert_line = 0.0
        else:
            per_assert_line = float(total_assertion / len(method_body.splitlines()))
        return null_assertions, per_assert_line, duplicate_assertions, total_exception_assertion

    def compute_variable_name_score(self, variable_name: str, variable_type: str, variable_initialization: str,
                                    call_sites: List[str],
                                    algorithm: str = 'levenshtein') -> float:
        """
        Given a variable name and its corresponding details, compute the closeness score
        Args:
            call_sites: call site details in the test method
            variable_name: variable name
            variable_type: fully qualified variable type
            variable_initialization: initialization value
            algorithm: type of algorithm used to compute the score

        Returns:
            int
            returns the closeness
        """
        # For primitive types match variable name with the variable initialization
        if len(call_sites) > 0:
            variable_initialization_context = variable_initialization + ';\n' + ';\n'.join(call_sites) + ';'
            variable_type_context = variable_type + ';\n' + ';\n'.join(call_sites) + ';'
        else:
            variable_initialization_context = variable_initialization + ';'
            variable_type_context = variable_type + ';'
        if variable_type in self.analyze.get_java_primitive_types():
            return ComputeNaturalnessScore.calculate_similarity_score(variable_name,
                                                                      variable_initialization_context,
                                                                      algorithm)
        # For non-primitive types match variable name with the variable initialization and variable type,
        # and return the max
        else:
            return (max(ComputeNaturalnessScore.calculate_similarity_score(variable_name,
                                                                           variable_type_context,
                                                                           algorithm),
                        ComputeNaturalnessScore.calculate_similarity_score(variable_name,
                                                                           variable_initialization_context,
                                                                           algorithm)))

    def compute_variable_name_closeness_score(self, qualified_test_class_name: str,
                                              qualified_method_name: str) -> float:
        """
        Given a qualified test class name and method name, returns the variable closeness score
        Args:
            qualified_test_class_name: qualified test class
            qualified_method_name: method name

        Returns:
            float
            Variable closeness score
        """
        score = 0.0
        variables_under_scope: dict[str, list[str]] = {}
        variable_details, call_site_info = (self.analyze.get_variable_details(
            qualified_class_name=qualified_test_class_name))
        # Get the method details
        method_details = self.preprocessor.get_method(qualified_class_name=qualified_test_class_name,
                                                                      qualified_method_name=qualified_method_name)
        # Get the class fields that are referenced in this method
        if len(method_details.accessed_fields) > 0:
            for field in method_details.accessed_fields:
                if field in variable_details:
                    variables_under_scope[field.split('.')[-1]] = variable_details[field]
        # Get variables that are declared within this method
        for variable in variable_details:
            if qualified_method_name in variable:
                variables_under_scope[variable.split('.')[-1]] = variable_details[variable]

        if len(variables_under_scope) == 0:
            return 0

        for variable in variables_under_scope:
            score += self.compute_variable_name_score(variable_name=variable,
                                                      variable_type=variables_under_scope[variable][0],
                                                      call_sites=call_site_info[qualified_method_name],
                                                      variable_initialization=variables_under_scope[variable][1])
        return float(score / len(variables_under_scope))

    def compute_test_method_name_score(self, qualified_class_name: str,
                                       method_name: str, method_body: str,
                                       is_method_name_matched: bool,
                                       thrown_exceptions: List[str],
                                       algorithm: str = 'levenshtein') -> float:
        """
        Given a method name and its corresponding details, compute the closeness score
        Args:
            thrown_exceptions: List of exceptions thrown
            is_method_name_matched: Check whether method name matches with the focal method
            qualified_class_name: qualified test class name
            method_name: test method name
            method_body: test body
            algorithm: type of algorithm used to compute the score

        Returns:
            float
            returns the closeness
        """
        if is_method_name_matched:
            match_score = 1
        else:
            match_score = 0
        match, matched_focal_method = self.analyze.is_focal_method_covered(
            qualified_test_class_name=qualified_class_name,
            qualified_method_name=method_name)
        method_name = (method_name.lower().split('(')[0].replace('test', '').
                       replace(matched_focal_method.split('(')[0].lower(), ''))
        if 'throw' in method_name:
            exceptions_method_name = method_name.replace('throws', '').replace('throw', '')
        else:
            exceptions_method_name = ''
        # Punish the score if focal method name is not present
        return (match_score +
                max(self.calculate_similarity_score(method_name, method_body, algorithm),
                    self.calculate_similarity_score(method_name, '\n;'.join(thrown_exceptions) + ';', algorithm),
                    self.calculate_similarity_score(exceptions_method_name, method_body, algorithm),
                    self.calculate_similarity_score(exceptions_method_name, '\n;'.join(thrown_exceptions) + ';',
                                                    algorithm)
                    )
                ) / 2

    @staticmethod
    def compute_literal_diversity_score(literal_details: Dict[str, List[str]],
                                        algorithm: str = 'n-gram') -> float:
        """
        Given details, compute the literal diversity
        Args:
            algorithm: type of algorithm used to compute the score
            literal_details:

        Returns:

        """
        all_literals = []
        for method in literal_details:
            all_literals.append(' '.join(literal_details[method]))
        return ComputeNaturalnessScore.compute_diversity_score(literals=all_literals, algorithm=algorithm)

    @staticmethod
    def compute_diversity_score(literals: List[str], algorithm: str = 'n-gram', n: int = 2) -> float:
        """
        Given a list of literals, compute the diversity score
        Args:
            literals: list of literals
            algorithm: algorithm to compute diversity score
            n: n-gram length
        Returns:
            float: diversity score

        """
        match algorithm:
            case 'n-gram':
                all_ngrams = []
                for literal_per_method in literals:
                    ngrams_in_text = ComputeNaturalnessScore.generate_ngrams(literal_per_method, n)
                    all_ngrams.extend(ngrams_in_text)

                unique_ngrams = set(all_ngrams)
                total_ngrams = len(all_ngrams)
                diversity_ratio = len(unique_ngrams) / total_ngrams if total_ngrams > 0 else 0
                return diversity_ratio
            case _:
                return 0.0

    @staticmethod
    def calculate_similarity_score(needle: str, hay: str, algorithm: str = 'levenshtein') -> float:
        """
        compute similarity score
        Args:
            algorithm: similarity algorithm
            needle: thing to match
            hay: find the match
1-(nltk.edit_distance('barcelona', 'Barcelona') /max(len('barcelona') , len('Barcelona')))
        Returns:
            float: similarity score
        """
        needle = needle.lower()
        hay = hay.lower()
        # vec = TfidfVectorizer()
        # tf_idf_matrix = vec.fit_transform([needle, hay])
        # Split word using _ and camel casing
        split_needles = ComputeNaturalnessScore.__split_method_names(method_name=needle)
        match algorithm:
            # case 'cosine':
            #     return cosine_similarity(tf_idf_matrix[0:1], tf_idf_matrix)[0][1]
            case 'levenshtein':
                final_score = []
                tokens = TreeSitter().get_lexical_tokens(code=hay, filter_by_node_type=[
                    'identifier',
                    'string_literal',
                    'class_literal',
                    'string_fragment',
                    'property_identifier',
                    'type_identifier',
                    'scoped_type_identifier',
                    'multiline_string_fragment',
                    'string_interpolation',
                    'null_literal'])
                tokens = list(set(tokens))
                for i in range(0, len(split_needles)):
                    score = []
                    if i + 1 != len(split_needles):
                        for token in tokens:
                            # Compute levenshtein score
                            score.append(ComputeNaturalnessScore.__compute_edit_distance(
                                token1=split_needles[i] + ' ' + split_needles[i + 1], token2=token))
                            score.append(ComputeNaturalnessScore.__compute_edit_distance(
                                token1=split_needles[i] + split_needles[i + 1], token2=token))
                            score.append(ComputeNaturalnessScore.__compute_edit_distance(token1=split_needles[i],
                                                                                         token2=token))
                    else:
                        for token in tokens:
                            score.append(ComputeNaturalnessScore.__compute_edit_distance(token1=split_needles[i],
                                                                                         token2=token))
                    # for split_needle in split_needles:
                    #     score = []
                    #     for token in tokens:
                    #         # Compute levenshtein score
                    #         score.append(ComputeNaturalnessScore.__compute_edit_distance(token1=split_needle,
                    #                                                                      token2=token))
                    if len(score) > 0:
                        final_score.append(max(score))
                if len(final_score) == 0:
                    return 0.0
                return sum(final_score) / len(final_score)
            case _:
                return 0.0

    @staticmethod
    def __compute_edit_distance(token1: str, token2: str) -> float:
        """
        Return the edit distance
        Args:
            token1:
            token2:

        Returns:
            float:
            edit distance

        """
        return 1 - (nltk.edit_distance(token1, token2) /
                    max(len(token1), len(token2)))

    @staticmethod
    def __split_method_names(method_name: str) -> List[str]:
        """
        Split method names by _ and camel casing
        Args:
            method_name: method name

        Returns:
            List[str]
            each part of the name
        """
        final_name_parts = []
        split_by_underscore = method_name.split('_')
        for split_by_underscore in split_by_underscore:
            final_name_parts.extend(ComputeNaturalnessScore.__split_by_camel_casing(word=split_by_underscore))
        return final_name_parts

    @staticmethod
    def __split_by_camel_casing(word: str) -> List[str]:
        """
        Split word by camel casing
        Returns:
            List[str]

        """
        if word == '':
            return []
        split_words = []
        current_char = word[0]
        for ch in word[1:]:
            if ch.isupper():
                split_words.extend(ComputeNaturalnessScore.__split_by_number(current_char))
                current_char = ch
            else:
                current_char += ch
        split_words.extend(ComputeNaturalnessScore.__split_by_number(current_char))
        return split_words

    @staticmethod
    def __split_by_number(word: str) -> List[str]:
        pattern = re.compile(r'([a-zA-Z]+)(\d+)')
        match = pattern.match(word)
        if match:
            return [match.groups()[0], match.groups()[1]]
        else:
            return [word]


if __name__ == '__main__':
    print(ComputeNaturalnessScore.generate_ngrams('hello world', 2))
