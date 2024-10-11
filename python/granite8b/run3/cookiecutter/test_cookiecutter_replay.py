import unittest
import json
import os
from cookiecutter.utils import make_sure_path_exists
from cookiecutter.replay import get_file_name, dump, load
from cookiecutter.replay import dump, load


def test_get_file_name():
    replay_dir = '/tmp/replay'
    template_name = 'test'
    file_name = get_file_name(replay_dir, template_name)
    expected_file_name = os.path.join(replay_dir, 'test.json')
    assert file_name == expected_file_name

def test_dump():
    replay_dir = '/tmp/replay'
    template_name = 'test'
    context = {'cookiecutter': {'project_name': 'Test Project'}}
    dump(replay_dir, template_name, context)
    replay_file = get_file_name(replay_dir, template_name)
    with open(replay_file, 'r') as infile:
        loaded_context = json.load(infile)
    assert loaded_context == context


class TestReplay(unittest.TestCase):
    def test_dump(self):
        replay_dir = '/tmp/test_replay'
        template_name = 'test_template'
        context = {'cookiecutter': {'project_name': 'Test Project'}}
        dump(replay_dir, template_name, context)
        replay_file = os.path.join(replay_dir, f'{template_name}.json')
        self.assertTrue(os.path.exists(replay_file))
        with open(replay_file, 'r') as f:
            data = json.load(f)
        self.assertEqual(data, context)

    def test_load(self):
        replay_dir = '/tmp/test_replay'
        template_name = 'test_template'
        context = {'cookiecutter': {'project_name': 'Test Project'}}
        dump(replay_dir, template_name, context)
        loaded_context = load(replay_dir, template_name)
        self.assertEqual(loaded_context, context)

if __name__ == '__main__':
    unittest.main()