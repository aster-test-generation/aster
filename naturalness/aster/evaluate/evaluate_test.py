import json
import os
from pathlib import Path
from typing import Dict, Tuple

import numpy as np
import pandas as pd
import plotly.express as px
from cldk import CLDK
from pandas import DataFrame
from tqdm import tqdm

from aster.evaluate import NaturalnessEvaluator
from aster.evaluate.naturalness.utils.code_analysis import AnalyzeCodeForNaturalness
from aster.utils import constants
from aster.utils.richlog import RichLog


class EvaluateTest:
    def __init__(self, project_root: str, is_analysis_need: bool) -> None:
        self.dataset_path = Path(project_root).parent
        self.project_root = project_root
        self.dataset = Path(project_root).name
        project_dir = Path.cwd().joinpath(self.dataset_path, self.dataset).__str__()
        cldk = CLDK(language="java")
        self.analysis = cldk.analysis(
            project_path=project_dir,
            analysis_backend="codeanalyzer",
            analysis_json_path=Path.cwd().joinpath(constants.EVALUATE_OUTPUT_DIR, self.dataset),
            eager=is_analysis_need
        )
        self.preprocessor = self.analysis

    def evaluate_naturalness(self, generated_by: str, target_class: str,
                             granularity: str, output_path: Path, output_format: str) -> None:
        """
        Evaluate naturalness
        Args:
            generated_by: test cases generated by aster, evosuite, or developer written
            target_class: focal class
            granularity: granularity of the result
            output_path: output directory
            output_format: format used to save the output

        Returns:

        """
        inclusions = ['Test']
        exclusions = []
        aster_test_cases = []
        evosuite_test_cases = []
        developer_test_cases = []
        aster_naturalness: dict[str, dict[str, Dict[str, float]]] = {}
        es_naturalness: dict[str, dict[str, Dict[str, float]]] = {}
        dev_naturalness: dict[str, dict[str, Dict[str, float]]] = {}
        os.makedirs(output_path, exist_ok=True)
        # Get the test files given the chosen 'generated by' parameter
        match generated_by:
            case 'aster':
                inclusions.append(constants.TEST_PREFIX)
            case 'evosuite':
                inclusions.append(constants.EVOSUITE_TEST_SUFFIX)
                exclusions.append(constants.EVOSUITE_TEST_SCAFFOLDING)
            case 'developers':
                exclusions.append(constants.TEST_PREFIX)
                exclusions.append(constants.EVOSUITE_TEST_SUFFIX)
            case 'aster_vs_dev':
                inclusions.append(constants.TEST_PREFIX)
            case 'all':
                inclusions.append(constants.TEST_PREFIX)
                inclusions.append(constants.EVOSUITE_TEST_SUFFIX)
            case _:
                RichLog.error(f"Unrecognized command: {generated_by}")
        all_test_classes = self.analysis.get_classes_by_criteria(inclusions=inclusions,
                                                                                         exclusions=exclusions)
        RichLog.info(f"Total classes found: {len(all_test_classes)}")
        # Identify test classes given the focal class
        for test_class in all_test_classes:
            if target_class != 'all':
                if target_class in (AnalyzeCodeForNaturalness(self.preprocessor).
                        identify_focal_class(qualified_test_class_name=test_class)):
                    if constants.TEST_PREFIX in test_class:
                        aster_test_cases.append(test_class)
                    elif constants.EVOSUITE_TEST_SUFFIX in test_class:
                        if constants.EVOSUITE_TEST_SCAFFOLDING not in test_class:
                            evosuite_test_cases.append(test_class)
                    else:
                        developer_test_cases.append(test_class)
            else:
                if constants.TEST_PREFIX in test_class:
                    aster_test_cases.append(test_class)
                elif constants.EVOSUITE_TEST_SUFFIX in test_class:
                    evosuite_test_cases.append(test_class)
                else:
                    developer_test_cases.append(test_class)

        # Compute naturalness score
        if generated_by in ['aster', 'all', 'aster_vs_dev']:
            RichLog.info(f"Total aster test classes found: {len(aster_test_cases)}")
            for test_class in tqdm(aster_test_cases,
                 total=len(aster_test_cases),
                 bar_format="{desc:<5.5}{percentage:3.0f}%|{bar:10}{r_bar}"):
                aster_naturalness[test_class] = self.__compute_naturalness(class_name=test_class, granularity=granularity)

        if generated_by in ['evosuite', 'all']:
            RichLog.info(f"Total evosuite test classes found: {len(evosuite_test_cases)}")

            for test_class in tqdm(evosuite_test_cases,
                 total=len(evosuite_test_cases),
                 bar_format="{desc:<5.5}{percentage:3.0f}%|{bar:10}{r_bar}"):
                es_naturalness[test_class] = self.__compute_naturalness(class_name=test_class, granularity=granularity)

        if generated_by in ['developers', 'all', 'aster_vs_dev']:
            RichLog.info(f"Total dev/tackletest test classes found: {len(developer_test_cases)}")
            for test_class in tqdm(developer_test_cases,
                 total=len(developer_test_cases),
                 bar_format="{desc:<5.5}{percentage:3.0f}%|{bar:10}{r_bar}"):
                dev_naturalness[test_class] = self.__compute_naturalness(class_name=test_class, granularity=granularity)
        # Match the output format
        match output_format:
            # If JSON, then dump the output
            case 'json':
                if len(aster_naturalness.keys()) > 0:
                    with open(output_path.joinpath('aster.json'), 'w') as fp:
                        json.dump(aster_naturalness, fp)
                if len(es_naturalness.keys()) > 0:
                    with open(output_path.joinpath('evosuite.json'), 'w') as fp:
                        json.dump(es_naturalness, fp)
                if len(dev_naturalness.keys()) > 0:
                    with open(output_path.joinpath('developer.json'), 'w') as fp:
                        json.dump(dev_naturalness, fp)
            case 'mean_median':
                if len(aster_naturalness.keys()) > 0:
                    mean, median = self.__compute_naturalness_mean_median_list(json_format_input=aster_naturalness,
                                                                               granularity=granularity,
                                                                               is_mean_median=True,
                                                                               type='aster',
                                                                               output_path=output_path, prefix='')
                    RichLog.info(f'aster naturalness: mean: {json.dumps(mean, sort_keys=True, indent=4)}\n, '
                                 f'median: {json.dumps(median, sort_keys=True, indent=4)}')
                if len(es_naturalness.keys()) > 0:
                    mean, median = self.__compute_naturalness_mean_median_list(json_format_input=es_naturalness,
                                                                               granularity=granularity,
                                                                               is_mean_median=True,
                                                                               type='es',
                                                                               output_path=output_path, prefix='')
                    RichLog.info(f'EvoSuite naturalness: mean: {json.dumps(mean, sort_keys=True, indent=4)}\n, '
                                 f'median: {json.dumps(median, sort_keys=True, indent=4)}')
                if len(dev_naturalness.keys()) > 0:
                    mean, median = self.__compute_naturalness_mean_median_list(json_format_input=dev_naturalness,
                                                                               granularity=granularity,
                                                                               is_mean_median=True,
                                                                               type='dev',
                                                                               output_path=output_path, prefix=''
                                                                               )
                    RichLog.info(f'Dev naturalness: mean: {json.dumps(mean, sort_keys=True, indent=4)}\n, '
                                 f'median: {json.dumps(median, sort_keys=True, indent=4)}')
            case 'list':
                dataset_prefix = self.project_root.replace(os.sep, '.')
                if len(aster_naturalness.keys()) > 0:
                    self.__compute_naturalness_mean_median_list(json_format_input=aster_naturalness, type='aster',
                                                                output_path=output_path, prefix=dataset_prefix,
                                                                granularity=granularity, is_mean_median=False)
                if len(es_naturalness.keys()) > 0:
                    self.__compute_naturalness_mean_median_list(json_format_input=es_naturalness, type='es',
                                                                output_path=output_path, prefix=dataset_prefix,
                                                                granularity=granularity, is_mean_median=False)
                if len(dev_naturalness.keys()) > 0:
                    self.__compute_naturalness_mean_median_list(json_format_input=dev_naturalness, type='dev',
                                                                output_path=output_path, prefix=dataset_prefix,
                                                                granularity=granularity, is_mean_median=False)
                RichLog.info('Saved the output in list format.')
            # Otherwise generate visualization
            case _:
                nat_details = {'aster': aster_naturalness, 'evosuite': es_naturalness, 'developer': dev_naturalness}
                self.__create_visualization(naturalness_details=nat_details, output_format=output_format,
                                            output_path=output_path)

    @staticmethod
    def __compute_naturalness_mean_median_list(json_format_input: dict, granularity: str, type: str, output_path: Path,
                                               prefix: str, is_mean_median: bool) -> [Tuple[dict, dict] | None]:
        assertion_percentage = []
        method_naturalness = []
        variable_naturalness = []
        method_name_covered = []
        assertion_complexity = []
        null_assertion = []
        exception_assertion = []
        no_assertion = []
        literal_diversity = []
        mean = {}
        median = {}
        for clazz in json_format_input:
            if granularity == 'klazz':
                if json_format_input[clazz][clazz]['Number of methods'] > 0:
                    assertion_percentage.append(json_format_input[clazz][clazz]['% of Duplicate Assertions'])
                    if json_format_input[clazz][clazz]['Naturalness of method name'] > 0:
                        method_naturalness.append(json_format_input[clazz][clazz]['Naturalness of method name'])
                    if json_format_input[clazz][clazz]['Naturalness of variable name'] > 0:
                        variable_naturalness.append(json_format_input[clazz][clazz]['Naturalness of variable name'])
                    if json_format_input[clazz][clazz]['% of focal method covered'] > 0:
                        method_name_covered.append(json_format_input[clazz][clazz]['% of focal method covered'])
                    if json_format_input[clazz][clazz]['Assertion complexity'] > 0:
                        assertion_complexity.append(json_format_input[clazz][clazz]['Assertion complexity'])
                    if json_format_input[clazz][clazz]['% of Null Assertions'] >= 0:
                        null_assertion.append(json_format_input[clazz][clazz]['% of Null Assertions'])
                    if json_format_input[clazz][clazz]['% of Exception Assertions'] >= 0:
                        exception_assertion.append(json_format_input[clazz][clazz]['% of Exception Assertions'])
                    if json_format_input[clazz][clazz]['% of No Assertion'] >= 0:
                        no_assertion.append(json_format_input[clazz][clazz]['% of No Assertion'])
                    literal_diversity.append(json_format_input[clazz][clazz]['Diversity of literal values'])
            else:
                for method in json_format_input[clazz]:
                    if not json_format_input[clazz][method]['No Assertion']:
                        assertion_percentage.append(json_format_input[clazz][method]['% of Duplicate Assertions'])
                        assertion_complexity.append(json_format_input[clazz][method]['Assertion complexity'])
                        null_assertion.append(json_format_input[clazz][method]['% of Null Assertions'])
                        exception_assertion.append(json_format_input[clazz][method]['% of Exception Assertions'])
                    method_naturalness.append(json_format_input[clazz][method]['Naturalness of method name'])
                    variable_naturalness.append(json_format_input[clazz][method]['Naturalness of variable name'])
                    method_name_covered.append(json_format_input[clazz][method]['% of focal method covered'])
                    no_assertion.append(1 if json_format_input[clazz][method]['No Assertion'] else 0)
                    literal_diversity.append(json_format_input[clazz][method]['Diversity of literal values'])
        if is_mean_median:
            mean['% of Duplicate Assertions'] = np.mean(assertion_percentage)
            mean['Naturalness of method name'] = np.mean(method_naturalness)
            mean['Naturalness of variable name'] = np.mean(variable_naturalness)
            mean['% of focal method covered'] = np.mean(method_name_covered)
            mean['Assertion complexity'] = np.mean(assertion_complexity)
            mean['% of Null Assertions'] = np.mean(null_assertion)
            mean['% of Exception Assertions'] = np.mean(exception_assertion)
            mean['% of No Assertion'] = np.mean(no_assertion)
            mean['Diversity of literal values'] = np.mean(literal_diversity)

            median['% of Duplicate Assertions'] = np.median(assertion_percentage)
            median['Naturalness of method name'] = np.median(method_naturalness)
            median['Naturalness of variable name'] = np.median(variable_naturalness)
            median['% of focal method covered'] = np.median(method_name_covered)
            median['Assertion complexity'] = np.median(assertion_complexity)
            median['% of Null Assertions'] = np.median(null_assertion)
            median['% of Exception Assertions'] = np.median(exception_assertion)
            median['% of No Assertion'] = np.median(no_assertion)
            median['Diversity of literal values'] = np.median(literal_diversity)
            return mean, median
        else:
            with open(output_path.joinpath(type + '_' + prefix + '_assertion_percentage.json'), 'w') as fp:
                json.dump(assertion_percentage, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_method_naturalness.json'), 'w') as fp:
                json.dump(method_naturalness, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_variable_naturalness.json'), 'w') as fp:
                json.dump(variable_naturalness, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_method_name_covered.json'), 'w') as fp:
                json.dump(method_name_covered, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_assertion_complexity.json'), 'w') as fp:
                json.dump(assertion_complexity, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_null_assertion.json'), 'w') as fp:
                json.dump(null_assertion, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_literal_diversity.json'), 'w') as fp:
                json.dump(literal_diversity, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_no_assertion.json'), 'w') as fp:
                json.dump(no_assertion, fp)
            with open(output_path.joinpath(type + '_' + prefix + '_exception_assertion.json'), 'w') as fp:
                json.dump(exception_assertion, fp)


    def __create_visualization(self, naturalness_details: dict[str, dict[str, dict[str, Dict[str, float]]]],
                               output_format: str, output_path: Path) -> None:
        """
        Given the naturalness details, create visualization, and saves the output in the given format
        Args:
            naturalness_details: naturalness score
            output_format: output format to store the visualization
            output_path: output directory

        Returns:

        """
        # Get naturalness data
        aster_naturalness: dict[str, dict[str, Dict[str, float]]] = naturalness_details['aster']
        es_naturalness: dict[str, dict[str, Dict[str, float]]] = naturalness_details['evosuite']
        dev_naturalness: dict[str, dict[str, Dict[str, float]]] = naturalness_details['developer']
        # Convert to dataframe
        aster_df = EvaluateTest.__get_list_from_dictionary(dictionary=aster_naturalness, generated_by='aster')
        es_df = EvaluateTest.__get_list_from_dictionary(dictionary=es_naturalness, generated_by='EvoSuite')
        dev_df = EvaluateTest.__get_list_from_dictionary(dictionary=dev_naturalness, generated_by='Developers')
        final_df = EvaluateTest.__concat_dataframe(aster_df, es_df, dev_df)
        # Plot the pictures
        fig = px.box(final_df, x="Naturalness Metric", y="Score", color="Test Generated By",
                     color_discrete_map={'aster': 'rgb(0, 67, 206)',
                                         'Developers': 'rgb(2, 43, 48)',
                                         'EvoSuite': 'rgb(81, 2, 36)'})  # IBM Blue
        fig.update_layout(
            plot_bgcolor='rgb(246, 242, 255)'
        )
        fig.update_traces(boxmean=True)
        fig.write_image(Path(output_path).
                        joinpath(f'{self.dataset}{constants.NATURALNESS_FILE_SUFFIX}.{output_format}'))
        fig.show()

    @staticmethod
    def __get_list_from_dictionary(dictionary: dict, generated_by: str) -> DataFrame:
        """
        Create a dataframe from the naturalness dictionary
        Args:
            dictionary:
            generated_by:

        Returns:

        """
        ret_list = []
        for test_class in dictionary:
            for selected_granularity in dictionary[test_class]:
                for metric in dictionary[test_class][selected_granularity]:
                    ret_list.append((metric, generated_by, test_class + '.' + selected_granularity,
                                     dictionary[test_class][selected_granularity][metric]))
        return pd.DataFrame.from_records(ret_list, columns=['Naturalness Metric', 'Test Generated By',
                                                            'Qualified Name', 'Score']).dropna()

    def __compute_naturalness(self, class_name: str, granularity: str) -> dict[str, dict[str, float]]:
        """
        Compute the naturalness of the given class and granularity
        Args:
            class_name: qualified test class name
            granularity: granularity of the score

        Returns:
            dict[str, dict[str, float]]
            key: test method/class name
            value: key: different natural metrics, value: naturalness score
        """
        match granularity:
            case 'method':
                naturalness = (NaturalnessEvaluator(self.preprocessor).
                               get_naturalness_score_per_test_method(qualified_test_class_name=class_name))
                naturalness_per_test_class = ((NaturalnessEvaluator(self.preprocessor)).
                get_naturalness_score_per_test_class(
                    qualified_test_class_name=class_name))
                for method in naturalness:
                    naturalness[method]['% of focal method covered'] = (
                        naturalness_per_test_class['% of focal method covered'])
                    naturalness[method]['Diversity of literal values'] = (
                        naturalness_per_test_class['Diversity of literal values'])
                return naturalness

            case 'clazz':
                return_score = {}
                naturalness_score = ((NaturalnessEvaluator(self.preprocessor)).
                                     get_naturalness_score_per_test_class(qualified_test_class_name=class_name))
                return_score[class_name] = naturalness_score
                return return_score
            case _:
                return {}

    @staticmethod
    def __concat_dataframe(aster_df: DataFrame, es_df: DataFrame, dev_df: DataFrame) -> [None | DataFrame]:
        """
        Concatenates data frames
        Args:
            aster_df: aster dataframe
            es_df:  Evosuite dataframe
            dev_df: Developer dataframe

        Returns:
            DataFrame:
                Concatenated data frame
        """
        final_df: [None | DataFrame] = None
        if len(aster_df.index) > 0:
            if final_df is not None:
                final_df = pd.concat([final_df, aster_df])
            else:
                final_df = aster_df
        if len(es_df.index) > 0:
            if final_df is not None:
                final_df = pd.concat([final_df, es_df])
            else:
                final_df = es_df
        if len(dev_df.index) > 0:
            if final_df is not None:
                final_df = pd.concat([final_df, dev_df])
            else:
                final_df = dev_df
        return final_df
