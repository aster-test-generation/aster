import json
import os
import unittest
from cookiecutter.replay import dump, load


class TestReplay(unittest.TestCase):
    def test_dump(self):
        replay_dir = '/tmp/replay'
        template_name = 'test'
        context = {'cookiecutter': {'project_name': 'test_project'}}
        dump(replay_dir, template_name, context)
        replay_file = os.path.join(replay_dir, f'{template_name}.json')
        self.assertTrue(os.path.exists(replay_file))
        with open(replay_file, 'r') as f:
            data = json.load(f)
            self.assertEqual(data, context)

    def test_load(self):
        replay_dir = '/tmp/replay'
        template_name = 'test'
        context = {'cookiecutter': {'project_name': 'test_project'}}
        dump(replay_dir, template_name, context)
        loaded_context = load(replay_dir, template_name)
        self.assertEqual(loaded_context, context)

if __name__ == '__main__':
    unittest.main()