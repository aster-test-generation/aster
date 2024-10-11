import json
import os
import unittest
from cookiecutter.replay import get_file_name, dump, load


class TestReplay(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        expected_file_name = os.path.join(replay_dir, f'{template_name}.json')
        file_name = get_file_name(replay_dir, template_name)
        self.assertEqual(file_name, expected_file_name)

    def test_dump(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        replay_file = get_file_name(replay_dir, template_name)
        with open(replay_file, 'r') as infile:
            loaded_context = json.load(infile)
        self.assertEqual(loaded_context, context)

    def test_load(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        loaded_context = load(replay_dir, template_name)
        self.assertEqual(loaded_context, context)

if __name__ == '__main__':
    unittest.main()