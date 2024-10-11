import unittest
import json
import os
from unittest.mock import patch, mock_open
from cookiecutter.replay import get_file_name, dump, load
from cookiecutter.utils import make_sure_path_exists


class TestGetFileName(unittest.TestCase):
    def test_get_file_name_with_suffix(self):
        result = get_file_name('replay_dir', 'template_name')
        self.assertEqual(result, os.path.join('replay_dir', 'template_name.json'))

    def test_get_file_name_with_json_suffix(self):
        result = get_file_name('replay_dir', 'template_name.json')
        self.assertEqual(result, os.path.join('replay_dir', 'template_name.json'))

class TestDump(unittest.TestCase):
    @patch('cookiecutter.replay.make_sure_path_exists', return_value=True)
    @patch('builtins.open', new_callable=mock_open)
    def test_dump_success(self, mock_file, mock_make_sure_path_exists):
        context = {'cookiecutter': {}}
        dump('replay_dir', 'template_name', context)
        mock_file.assert_called_once_with(os.path.join('replay_dir', 'template_name.json'), 'w')
        mock_file().write.assert_called_once_with(json.dumps(context, indent=2))

    @patch('cookiecutter.replay.make_sure_path_exists', return_value=False)
    def test_dump_io_error(self, mock_make_sure_path_exists):
        with self.assertRaises(IOError):
            dump('replay_dir', 'template_name', {'cookiecutter': {}})

    def test_dump_type_error_template_name(self):
        with self.assertRaises(TypeError):
            dump('replay_dir', 123, {'cookiecutter': {}})

    def test_dump_type_error_context(self):
        with self.assertRaises(TypeError):
            dump('replay_dir', 'template_name', 'not_a_dict')

    def test_dump_value_error_context(self):
        with self.assertRaises(ValueError):
            dump('replay_dir', 'template_name', {})

class TestLoad(unittest.TestCase):
    @patch('builtins.open', new_callable=mock_open, read_data='{"cookiecutter": {}}')
    def test_load_success(self, mock_file):
        result = load('replay_dir', 'template_name')
        self.assertEqual(result, {'cookiecutter': {}})

    @patch('builtins.open', new_callable=mock_open, read_data='{}')
    def test_load_value_error(self, mock_file):
        with self.assertRaises(ValueError):
            load('replay_dir', 'template_name')

    def test_load_type_error_template_name(self):
        with self.assertRaises(TypeError):
            load('replay_dir', 123)

if __name__ == '__main__':
    unittest.main()