import unittest
from cookiecutter.find import find_template


class TestFindTemplate(unittest.TestCase):
    def test_find_template(self):
        result = find_template('test_dir')
        self.assertIsNone(result)

    def test_find_template_with_project_template(self):
        result = find_template('test_dir_with_project_template')
        self.assertIsNotNone(result)

    def test_find_template_with_non_templated_input_dir(self):
        with self.assertRaises(NonTemplatedInputDirException):
            find_template('test_non_templated_input_dir')

    def test_find_template_with_logger_debug(self):
        logger = logging.getLogger(__name__)
        find_template('test_dir')
        self.assertTrue(logger.isEnabledFor(logging.DEBUG))

    def test_find_template_with_logger_info(self):
        logger = logging.getLogger(__name__)
        logger.setLevel(logging.INFO)
        find_template('test_dir')
        self.assertTrue(logger.isEnabledFor(logging.INFO))

    def test_find_template_with_logger_warning(self):
        logger = logging.getLogger(__name__)
        logger.setLevel(logging.WARNING)
        find_template('test_dir')
        self.assertTrue(logger.isEnabledFor(logging.WARNING))

    def test_find_template_with_logger_error(self):
        logger = logging.getLogger(__name__)
        logger.setLevel(logging.ERROR)
        find_template('test_dir')
        self.assertTrue(logger.isEnabledFor(logging.ERROR))

if __name__ == '__main__':
    unittest.main()